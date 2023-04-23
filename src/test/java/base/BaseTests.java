package base;

import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.CookieManager;
import utils.NavigationPage;

import java.io.File;
import java.io.IOException;

public class BaseTests {

    private ChromeDriver driver;

    protected HomePage homepage;
    @BeforeClass
    public  void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver(getChromeOptions());
        //this is for selenium 4 features used to load the browser console devtools

        goHome();
        //setCookies();
        driver.manage().window().maximize();
        homepage = new HomePage(driver);
    }
    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");

    }
    @AfterMethod
    public void recordFailure(ITestResult result)
    {
        if(ITestResult.FAILURE==result.getStatus())
        {
            var camera = (TakesScreenshot)driver;
            File screenshot= camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot,new File("src/main/resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    private ChromeOptions getChromeOptions()
    {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
       // chromeOptions.addArguments("--headless=new");
        return chromeOptions;
    }
    private  void setCookies()
    {
        Cookie cookie = new Cookie.Builder("tau","123").domain("the-internet.herokuapp.com").build();
        driver.manage().addCookie(cookie);
    }
    @AfterClass
    public void tearDown()
    {
        driver.quit();

    }
    public NavigationPage getNavigationPage()
    {
        return new NavigationPage(driver);
    }
    public CookieManager getCookieManager()
    {
        return new  CookieManager(driver);
    }


}

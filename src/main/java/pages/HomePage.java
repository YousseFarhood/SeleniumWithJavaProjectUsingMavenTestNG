package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v109.log.Log;

public class HomePage {
    private ChromeDriver driver;
    public HomePage(ChromeDriver driver)
    {
        this.driver=driver;
    }
    public LoginPage clickFormAuthentication()
    {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown()
    {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public ForgetPasswordPage clickForgetPassword()
    {
        clickLink("Forgot Password");
        return  new ForgetPasswordPage(driver);
    }
    public HoversPage clickHoverPage()
    {
        clickLink("Hovers");
        return new HoversPage(driver);

    }
    public KeyPressPage clickKeyPress()
    {
        clickLink("Key Presses");
        return new KeyPressPage(driver);
    }
    public SliderPage clickSliderPage()
    {
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public JavaAlertsPage clickJavaScript()
    {
        clickLink("JavaScript Alerts");
        return new JavaAlertsPage(driver);
    }
    public FileUploadPage clickFileUpload()
    {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextPage clickContextMenu()
    {
        clickLink("Context Menu");
        return new ContextPage(driver);
    }
    public FramesPage clickFramePage()
    {
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPAge clickDyanmicLoading()
    {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPAge(driver);
    }
    public LargeDeepDOMPage clickLargeDeepDOM()
    {
        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll()
    {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleDropDownPage clickDropdown()
    {
        clickLink("Dropdown");
        return new MultipleDropDownPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindows()
    {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public BrokenImagesPage getConsoleDevTools()
    {   // Get The DevTools & Create A Session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // Enable The Console Logs
        devTools.send(Log.enable());

        // Add A Listener For The Logs
        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("----------");
            System.out.println("Level: " + logEntry.getLevel());
            System.out.println("Text: " + logEntry.getText());
            System.out.println("Broken URL: " + logEntry.getUrl());
        });

        clickLink("Broken Images");
        return new BrokenImagesPage(driver);
    }

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

}

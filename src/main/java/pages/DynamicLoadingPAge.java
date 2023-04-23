package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class DynamicLoadingPAge {
    private WebDriver driver;
    public DynamicLoadingPAge(WebDriver driver) {
    this.driver=driver;
    }
    //
    String text1="//a[contains(text(),'%s')]";
    String text2 = "//a[contains(text(),'%s')]";
    private By hiddenElement = By.xpath(String.format(text1,"Example 1"));
    private By renderedElement = By.xpath(String.format(text2,"Example 2"));
    public DynamicHiddenPage clickDynamicHidden()
    {
        driver.findElement(hiddenElement).click();
        return new DynamicHiddenPage(driver);
    }
    public RenderedElementPage clickrenderedElement(){
        driver.findElement(renderedElement).click();
        return new RenderedElementPage(driver);
    }
    public RenderedElementPage contextClickRenderedElement()
    {   /* in selenium 4 we don't have to use this action class to open a new tab
        Actions actions = new Actions(driver);
        driver.findElement(renderedElement).sendKeys(Keys.CONTROL,Keys.RETURN);
       this is the new approach to open a new tab in selenium 4
       */
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        System.out.println(driver.getWindowHandles().size());
        return new RenderedElementPage(driver);
    }

}

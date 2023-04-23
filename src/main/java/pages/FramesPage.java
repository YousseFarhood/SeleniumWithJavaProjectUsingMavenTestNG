package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By iframe = By.linkText("iFrame");
    private By nestedFrame = By.linkText("Nested Frames");


    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }
    public IFramePage clickIframe()
    {
        driver.findElement(iframe).click();
        return new IFramePage(driver);
    }
    public nestedFramePage clickNestedFrame()
    {
    driver.findElement(nestedFrame).click();
    return new nestedFramePage(driver);
    }
}

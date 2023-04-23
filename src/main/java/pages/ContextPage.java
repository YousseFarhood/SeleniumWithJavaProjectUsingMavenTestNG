package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    private WebDriver driver;

    public ContextPage(WebDriver driver) {
        this.driver = driver;
    }
    private By boxField = By.id("hot-spot");
    public void contextClickBox()
    {
        Actions actions = new Actions(driver);
        WebElement boxElement = driver.findElement(boxField);
        actions.moveToElement(boxElement).contextClick().perform();

    }
    public String alerts_getText()
    {
       return driver.switchTo().alert().getText();
    }
    public void alerts_acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
}

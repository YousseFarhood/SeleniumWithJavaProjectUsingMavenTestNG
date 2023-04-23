package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By resultField = By.id("result");
    public KeyPressPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterInput(String text)
    {
        driver.findElement(inputField).sendKeys(text);
    }
    public void enterPi()
    {
        enterInput(Keys.chord(Keys.LEFT_ALT,Keys.NUMPAD2,Keys.NUMPAD2,Keys.NUMPAD7)+ "= 3.14");
    }
    public String getResults()
    {
        return driver.findElement(resultField).getText();

    }
}

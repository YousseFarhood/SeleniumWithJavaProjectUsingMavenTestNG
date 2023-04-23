package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaAlertsPage {
    private WebDriver driver;
    private By triggerAlertField = By.cssSelector(" [onclick*='jsAlert()']");
    private By resultAlert=By.cssSelector("[id='result']");
    private By confirmAlertField = By.xpath("//button[@onclick='jsConfirm()']");
    private By promptAlertField = By.xpath("//button[@onclick='jsPrompt()']");


    public JavaAlertsPage(WebDriver driver) {
        this.driver=driver;
    }
    public void clickTriggerAlert()
    {
        driver.findElement(triggerAlertField).click();
    }
    public void clickPromptAlert()
    {
        driver.findElement(promptAlertField).click();
    }

    public void clickConfirmAlert()
    {
        driver.findElement(confirmAlertField).click();
    }
    public void alert_setInput(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }
    public void alert_acceptAlert()
    {
        driver.switchTo().alert().accept();
    }
    public void alert_dismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText()
    {
        return driver.switchTo().alert().getText();
    }
    public String getResult()
    {
        return driver.findElement(resultAlert).getText();
    }
}

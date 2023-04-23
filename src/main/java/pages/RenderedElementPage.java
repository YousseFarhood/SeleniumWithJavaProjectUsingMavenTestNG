package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class RenderedElementPage {
    private static WebDriver driver;
    public RenderedElementPage(WebDriver driver) {
    this.driver=driver;
    }
    public RenderedElementPage()
    {

    }
    private By startButton = By.cssSelector("#start button");
    private By resultText = By.cssSelector("#finish h4");
    public void clickStart()
    {
        driver.findElement(startButton).click();
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(resultText));

    }
    public String getResultText()
    {

        return driver.findElement(resultText).getText();
    }
    public  static boolean isStartDisplayed()
    {   RenderedElementPage rendered=new RenderedElementPage();

        return driver.findElement(rendered.startButton).isDisplayed();
    }

}

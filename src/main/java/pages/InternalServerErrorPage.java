package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InternalServerErrorPage {
    private WebDriver driver;
    private By alertfield= By.cssSelector("body>h1");
    public InternalServerErrorPage(WebDriver driver) {
        this.driver=driver;
    }
    public String getAlert()
    {
      return   driver.findElement(alertfield).getText();
    }
}

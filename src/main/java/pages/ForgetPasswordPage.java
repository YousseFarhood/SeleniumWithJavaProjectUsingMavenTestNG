package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;
    public ForgetPasswordPage(WebDriver driver) {
        this.driver=driver;
    }
    private By mailField= By.id("email");
    private By retrievePasswordfield = By.cssSelector("i[class='icon-2x icon-signin']");
    public void fillEmail(String mail)
    {
        driver.findElement(mailField).sendKeys(mail);
    }
    public InternalServerErrorPage clickRetrievePassword()
    {
        driver.findElement(retrievePasswordfield).click();
        return new InternalServerErrorPage(driver);

    }
}

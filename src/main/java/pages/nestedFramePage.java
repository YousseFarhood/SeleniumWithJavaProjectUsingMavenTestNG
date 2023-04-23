package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nestedFramePage {
    private WebDriver driver;
    String nameLeft = "frame-left";
    String nameBottom = "frame-bottom";
    String UpperFrame = "frame-top";
    private By leftElement = By.xpath("//body[contains(text(),'LEFT')]");
    private By bottomElement = By.xpath("//body[contains(text(),'BOTTOM')]");

    public nestedFramePage(WebDriver driver) {
    this.driver = driver;
    }
    private void goLeftFrame()
    {  var upper = driver.switchTo().frame(UpperFrame);

        upper.switchTo().frame(nameLeft);
    }
    private void goBottom()
    {
        driver.switchTo().frame(nameBottom);
    }
    private void goMain()
    {
        driver.switchTo().parentFrame();
    }
    public String getLeftFrame()
    {
        goLeftFrame();
      String leftText=  driver.findElement(leftElement).getText();
      goMain();
      goMain();
      return leftText;
    }
    public String getBottomFrame()
    {
        goBottom();
        String bottomText = driver.findElement(bottomElement).getText();
        goMain();
        return bottomText;
    }
}

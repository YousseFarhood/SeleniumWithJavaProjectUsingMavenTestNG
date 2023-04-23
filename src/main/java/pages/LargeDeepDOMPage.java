package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDOMPage {
    private WebDriver driver;
    public LargeDeepDOMPage(WebDriver driver) {
    this.driver=driver;
    }
    private By tableID=By.id("large-table");
    public void scrollIntoTable()
    {
        WebElement table=driver.findElement(tableID);
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor) driver).executeScript(script,table);
    }
}

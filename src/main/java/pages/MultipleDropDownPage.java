package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class MultipleDropDownPage {
    private WebDriver driver;
    public MultipleDropDownPage(WebDriver driver) {
        this.driver=driver;
    }
    private By dropDown=By.id("dropdown");
    public void selectMultipleOptions()
    {
        WebElement dropDownElement  =driver.findElement(dropDown);
        String script = "arguments[0].setAttribute('multiple', '')";
        ((JavascriptExecutor)driver).executeScript(script,dropDownElement);
    }
    public void selectBothOptions(String option)
    {

        selectFromOptions().selectByVisibleText(option);
    }
    public List<String> getAllSelectedOptions()
    {
     return   selectFromOptions().getAllSelectedOptions().stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public Select selectFromOptions()
    {
        return new Select(driver.findElement(dropDown));
    }

}

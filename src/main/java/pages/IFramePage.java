package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IFramePage {
    private WebDriver driver;
    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }
    private String iframeID= "mce_0_ifr";
    private By editorField = By.id("tinymce");
    private By decreaseIndentField = By.cssSelector("button[aria-label='Decrease indent']");
    private void enterEditor()
    {
        driver.switchTo().frame(iframeID);
    }
    private void goMainPage()
    {
        driver.switchTo().parentFrame();
    }
    public void clearEditor()
    {
        enterEditor();
        driver.findElement(editorField).clear();
        goMainPage();
    }
    public void setInput(String text)
    {
        enterEditor();
        driver.findElement(editorField).sendKeys(text);
        goMainPage();
    }
    public void clickDecreaseindent()
    {
        driver.findElement(decreaseIndentField).click();
    }
    public String getText()
    {
        enterEditor();
        String text = driver.findElement(editorField).getText();
        goMainPage();
        return text;
    }
}

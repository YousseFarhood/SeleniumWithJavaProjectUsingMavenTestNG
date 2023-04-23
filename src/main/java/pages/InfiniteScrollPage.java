package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    public InfiniteScrollPage(WebDriver driver) {
        this.driver=driver;
    }
    private By table = By.className("jscroll-added");

    /**
     *
     * @param index based-1
     */
    public void scrollIntoCertainParagraph(int index)
    {
     String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jse=((JavascriptExecutor)driver);
        while(getParagraphSize()<index){
            jse.executeScript(script);
        }

    }
    public int getParagraphSize()
    {
        return driver.findElements(table).size();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver)
    {
        this.driver=driver;
    }
    private By choosefile = By.id("file-upload");
    private By fileSubmit = By.id("file-submit");
    private By uploadedFiledField = By.id("uploaded-files");
    public void fillPath(String fullPath)
    {
        driver.findElement(choosefile).sendKeys(fullPath);
        clickUpload();
    }
    public void clickUpload()
    {
        driver.findElement(fileSubmit).click();
    }
    public String getResults(){
        return driver.findElement(uploadedFiledField).getText();
    }



}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    private WebDriver driver;
    private By sliderField = By.cssSelector("div>input");
    private By resultsField = By.tagName("span");

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slideSliderContainer(String requiredValue) {
        while (!getCurrentResult().equals(requiredValue) ) {
            driver.findElement(sliderField).sendKeys(Keys.ARROW_RIGHT);

        }
    }

        public String getResult ()
        {
            return getCurrentResult();
        }

        private String getCurrentResult ()
        {
            return driver.findElement(resultsField).getText();

        }

}

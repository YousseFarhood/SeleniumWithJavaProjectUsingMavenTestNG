package utils;

import org.openqa.selenium.WebDriver;

public class NavigationPage {
        private WebDriver driver;
        private WebDriver.Navigation navigate;
        public NavigationPage(WebDriver driver)
        {
            this.driver=driver;
            navigate=  driver.navigate();
        }
        public void goBack()
        {
          navigate.back();
        }
        public void refreshPage()
        {
            navigate.refresh();
        }
        public void goForward()
        {
            navigate.forward();
        }
        public void goTo(String url)
        {
            navigate.to(url);
        }
        public void switchToTabTitle(String title)
        {
            var Windows=driver.getWindowHandles();
            for(String window:Windows)
            {
                driver.switchTo().window(window);

            if(title.equals(driver.getTitle()))
            {
                break;
            }}
        }
}

package navigation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RenderedElementPage;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigations()
    {
        homepage.clickDropdown();
        getNavigationPage().goBack();
        getNavigationPage().refreshPage();
        getNavigationPage().goForward();
        getNavigationPage().goTo("https://www.linkedin.com/");
    }
    @Test
    public void testMultipleTabs()
    {
        homepage.clickMultipleWindows();
        getNavigationPage().switchToTabTitle("New Window");
    }
    @Test
    public void testSwitchToTabs()
    {
        var dynamicLoad = homepage.clickDyanmicLoading();
        dynamicLoad.contextClickRenderedElement();
        getNavigationPage().switchToTabTitle("Dynamically Loaded Page Elements");
       // Assert.assertEquals(RenderedElementPage.isStartDisplayed(),true,"not displayed");
        Assert.assertTrue(RenderedElementPage.isStartDisplayed());
    }
}

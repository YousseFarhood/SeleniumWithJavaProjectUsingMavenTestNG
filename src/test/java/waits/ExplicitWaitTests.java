package waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitTests extends BaseTests {
    @Test
    public void clickUntillHidden()
    {
        var dynamicPage = homepage.clickDyanmicLoading().clickDynamicHidden();
        dynamicPage.clickStart();
        Assert.assertEquals(dynamicPage.getText(),"Hello World!","this is not right");
    }
}

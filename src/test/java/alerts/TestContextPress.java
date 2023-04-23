package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContextPress extends BaseTests {
    @Test
    public void testContextClick()
    {
        var contextPage = homepage.clickContextMenu();
        contextPage.contextClickBox();
        String results = contextPage.alerts_getText();
        contextPage.alerts_acceptAlert();
        Assert.assertEquals(results,"You selected a context menu", "youssef please take care they are not matching");
    }
}

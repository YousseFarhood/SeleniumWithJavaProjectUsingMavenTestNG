package waits;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FluentWaitTest extends BaseTests {
    @Test
    public void testFluent()
    {
        var renderedPage= homepage.clickDyanmicLoading().clickrenderedElement();
        renderedPage.clickStart();
        Assert.assertEquals(renderedPage.getResultText(),"Hello World!","the rendered text is not right");
    }
}

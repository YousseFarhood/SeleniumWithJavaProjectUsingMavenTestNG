package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTests extends BaseTests {
    @Test
    public void testHovering()
    {
        var clickHover = homepage.clickHoverPage();
       var asserts= clickHover.hoverOverFigure(1);
        Assert.assertTrue(asserts.isCaptionDisplayed(),"it is not displayed");
        Assert.assertEquals(asserts.getHeaderName(),"name: user1","this is not the right header name");
        //hard coded links are not the best to assert with as it might change
        Assert.assertEquals(asserts.getLink(),"https://the-internet.herokuapp.com/users/1", "this is not the right link");
       //this is the right formula to assert links
        Assert.assertTrue(asserts.getLink().endsWith("/users/1"),"link is incorrect");
    }
}

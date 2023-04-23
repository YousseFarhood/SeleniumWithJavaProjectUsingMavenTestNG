package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTests {
    @Test(enabled = false)
    public void testsKeyPresses()
    {
       var keyPage = homepage.clickKeyPress();
       keyPage.enterInput("A"+ Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResults(),"You entered: BACK_SPACE", "they are not matching");
    }
    @Test
    public void testsPi()
    {
        var keypage = homepage.clickKeyPress();
       keypage.enterPi();
    }
}

package dopdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDropDownTests extends BaseTests {
    @Test
    public void testMultipleOptionDropDownList()
    {   var choose=homepage.clickDropdown();
        choose.selectMultipleOptions();
        choose.selectBothOptions("Option 1");
        choose.selectBothOptions("Option 2");
        Assert.assertEquals(choose.getAllSelectedOptions().size(),2,"they are not the same");

    }
}

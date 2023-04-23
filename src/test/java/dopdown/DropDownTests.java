package dopdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown()
    {   String option = "Option 1";
        String option2 ="Option 2";
        var dropdown = homepage.clickDropDown();
        dropdown.clickDropDown(option);
       List<String> selectedOptions = dropdown.getSelectedOptions();
       Assert.assertEquals(selectedOptions.size(),1,"incorrect size");
        Assert.assertTrue(selectedOptions.contains(option),"this is a wrong text");
    }
}

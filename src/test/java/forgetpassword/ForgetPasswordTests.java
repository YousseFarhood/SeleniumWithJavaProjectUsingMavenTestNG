package forgetpassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTests extends BaseTests {
    @Test
    public void testRetrievepassword()
    {
       var forgetpassword= homepage.clickForgetPassword();
       forgetpassword.fillEmail("TAU@example.com");
      var serverErrorpage = forgetpassword.clickRetrievePassword();
     String alert = serverErrorpage.getAlert();
        Assert.assertTrue(alert.contains("Internal Server Error"));


    }
}

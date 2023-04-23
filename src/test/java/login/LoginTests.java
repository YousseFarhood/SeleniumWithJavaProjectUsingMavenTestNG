package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin()
    {
    LoginPage loginPage= homepage.clickFormAuthentication();
    loginPage.setUsername("tomsmith");
    loginPage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
    Assert.assertEquals(secureAreaPage.getAlert(), "You logged into a secure area!\n" +
            "×","alert text:incorrect");
    //or
        Assert.assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!"),"alert text is not true");
    }
}

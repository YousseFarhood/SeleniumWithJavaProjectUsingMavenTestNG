package cookies;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCookies extends BaseTests {
    @Test
    public void testCookies()
    {
        homepage.clickDyanmicLoading();
        var cookie = getCookieManager().domainInputs("youssef","1234");
        getCookieManager().addCookie(cookie);
        getCookieManager().deleteCookie(cookie);
        Assert.assertFalse(getCookieManager().isCookiePresent(cookie),"cookie was not detected");
    }
}

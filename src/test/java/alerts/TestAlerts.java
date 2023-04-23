package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlerts extends BaseTests {
    @Test
    public void testsAcceptAlerts()
    {
       var alertPage = homepage.clickJavaScript();
        alertPage.clickTriggerAlert();
        alertPage.alert_acceptAlert();
        Assert.assertEquals(alertPage.getResult(),"You successfully clicked an alert","the result text is incorrect");
    }
    @Test
    public void testsDismissAlerts()
    {
        var alertsPage = homepage.clickJavaScript();
        alertsPage.clickConfirmAlert();
       String confirmText = alertsPage.alert_getText();
        alertsPage.alert_dismissAlert();
        Assert.assertEquals(confirmText,"I am a JS Confirm","the confirm text is not matching");
        Assert.assertEquals(alertsPage.getResult(),"You clicked: Cancel","the alert message is not the same");
    }
    @Test
    public void testSetinputAlert()
    {
        var alertspage = homepage.clickJavaScript();
        alertspage.clickPromptAlert();
        String text = "Youssef Farhood Software QA engineer";
        alertspage.alert_setInput(text);
        alertspage.alert_acceptAlert();
        Assert.assertEquals(alertspage.getResult(),"You entered: "+text,"the text is wrong");
    }
}

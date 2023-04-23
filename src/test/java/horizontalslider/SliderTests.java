package horizontalslider;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTests extends BaseTests {
    @Test
    public void testsHorizontalSLider()
    {
      var sliderPage=  homepage.clickSliderPage();
        sliderPage.slideSliderContainer("3");
        Assert.assertEquals(sliderPage.getResult(),"3","the two numbers are different");

    }
}

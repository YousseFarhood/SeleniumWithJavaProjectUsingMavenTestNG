package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFrames extends BaseTests {
    @Test
    public void testIframeTest()
    {   String text1 = "hello ";
        String text2 = "world";
        var framesPage = homepage.clickFramePage();
       var iFramePage = framesPage.clickIframe();
       iFramePage.clearEditor();
       iFramePage.setInput(text1);
       iFramePage.clickDecreaseindent();
       iFramePage.setInput(text2);
        Assert.assertEquals(iFramePage.getText(),text1+text2,"this is not the right assertion");
    }
    @Test
    public void testNestedFrameTest()
    {
        var framePage = homepage.clickFramePage();
        var nestedFramePage = framePage.clickNestedFrame();
        System.out.println(nestedFramePage.getLeftFrame()+" "+nestedFramePage.getBottomFrame());
        Assert.assertEquals(nestedFramePage.getLeftFrame(),"LEFT","not left");
        Assert.assertEquals(nestedFramePage.getBottomFrame(),"BOTTOM","not a bottom");
    }
}

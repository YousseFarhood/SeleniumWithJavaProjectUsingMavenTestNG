package fileuploads;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadedTests extends BaseTests {
    @Test
    public void testFileUploads()
    {
      var fileUploadPage =  homepage.clickFileUpload();
      fileUploadPage.fillPath("C:\\Users\\youssef.osama\\workspace\\testautomationu\\webdriver_java\\webdriver_java\\src\\main\\resources\\Youssef Farhood - Software Tester.pdf");
        Assert.assertEquals(fileUploadPage.getResults(),"Youssef Farhood - Software Tester.pdf", "they are not matching");
    }
}

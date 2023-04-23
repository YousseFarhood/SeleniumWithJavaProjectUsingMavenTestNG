package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class ScrollVisibleToDOMTests extends BaseTests {
    @Test
    public void testScrollIntoTable()
    {
        homepage.clickLargeDeepDOM().scrollIntoTable();
    }
}

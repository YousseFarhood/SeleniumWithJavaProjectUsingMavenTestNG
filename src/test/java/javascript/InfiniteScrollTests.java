package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class InfiniteScrollTests extends BaseTests {
    @Test
    public void testInfiniteScroll()
    {
        homepage.clickInfiniteScroll().scrollIntoCertainParagraph(6);
    }
}

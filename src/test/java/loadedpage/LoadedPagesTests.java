package loadedpage;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoadedPagesTests extends BaseTest {

    @Test
    public void testExample1Page() throws InterruptedException {
        var loadingPage = homePage.clickDynamicLoading();
                var loadingPage2 = loadingPage.clickExample1();
        loadingPage2.clickStartButton();
        assertEquals(loadingPage2.getResultText(),"Hello World!");
    }

    @Test
    public void testExample2Page(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getResultText(),"Hello World!");
    }
}

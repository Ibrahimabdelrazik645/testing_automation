package frames;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {

    @Test
    public void testLeftFrame(){
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromLeftFrame(),"LEFT");
    }

    @Test
    public void testBottomFrame(){
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();
        assertEquals(nestedFramesPage.getTextFromBottomFrame(),"BOTTOM");
    }
}

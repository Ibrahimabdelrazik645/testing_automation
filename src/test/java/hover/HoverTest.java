package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;
import pages.HoversPage.Caption;

import static org.testng.Assert.*;

public class HoverTest extends BaseTest {

    @Test
    public void testHoverFigure1(){
        HoversPage hoversPage = homePage.clickHovers();
        Caption caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isDisplayed(),"Caption is not displayed");
        assertEquals(caption.getCaption(),"name: user1","Incorrect Caption");
        assertEquals(caption.getLinkText(),"View profile","Incorrect Link Text");
        assertTrue(caption.getLink().endsWith("/users/1"),"Incorrect Link");
    }

    @Test
    public void testHoverFigure2() {
        HoversPage hoversPage = homePage.clickHovers();
        Caption caption = hoversPage.hoverOverFigure(2);
        assertTrue(caption.isDisplayed(),"Caption is not displayed");
        assertEquals(caption.getCaption(),"name: user2","Incorrect Caption");
        assertEquals(caption.getLinkText(),"View profile","Incorrect Link Text");
        assertTrue(caption.getLink().endsWith("/users/2"),"Incorrect Link");
    }

    @Test
    public void testHoverFigure3() {
        HoversPage hoversPage = homePage.clickHovers();
        Caption caption = hoversPage.hoverOverFigure(3);
        assertTrue(caption.isDisplayed(),"Caption is not displayed");
        assertEquals(caption.getCaption(),"name: user3","Incorrect Caption");
        assertEquals(caption.getLinkText(),"View profile","Incorrect Link Text");
        assertTrue(caption.getLink().endsWith("/users/2"),"Incorrect Link");
    }

}

package navigation;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTest {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        var windowManger = getWindowManger();
        windowManger.goBack();
        windowManger.refreshPage();
        windowManger.goForward();
        windowManger.goTo("https://www.google.com/");
        assertEquals(windowManger.getPageTitle(),"Google");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        var windowManger = getWindowManger();
        windowManger.switchToWindow("New Window");
        assertEquals(windowManger.getPageTitle(),"New Window");
    }

    @Test
    public void testSwitchTab2(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2NewTab();
        var windowManger = getWindowManger();
        windowManger.switchToNewWindow();
        assertTrue(loadingPage.isStartButtonDisplayed());

    }
}

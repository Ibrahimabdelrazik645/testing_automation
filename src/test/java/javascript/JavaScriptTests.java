package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTest {

    @Test
    public void testScrollToTable() throws InterruptedException {
        homePage.clickLargeDeepDOM().scrollToTable();
    }

    @Test
    public void testScrollToParagraph5() throws InterruptedException {
        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testDropDown(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.setMultipleOptions();
        dropDownPage.selectFromDropDown("Option 1");
        dropDownPage.selectFromDropDown("Option 2");
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),2);
        assertTrue(selectedOptions.contains("Option 1"));
        assertTrue(selectedOptions.contains("Option 2"));
    }
}

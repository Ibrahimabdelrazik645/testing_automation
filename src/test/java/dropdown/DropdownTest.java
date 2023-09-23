package dropdown;

import base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropdownTest extends BaseTest {

    private String[] options  = {"Option 1", "Option 2"};





    @Test
    public void testDropdown() {
        for (int i = 0 ; i < options.length ; i++) {
            testOption(options[i]);
            if (i != options.length - 1)
                retest();
        }
    }

    public void testOption(String option){
            var dropDownPage = homePage.clickDropDown();
            dropDownPage.selectFromDropDown(option);
            var selectedOptions = dropDownPage.getSelectedOption();
            assertEquals(selectedOptions.size(), 1, "Incoorect number of options");
            assertTrue(selectedOptions.contains(option), "Incorrect option");
        }

}

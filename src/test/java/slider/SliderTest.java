package slider;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SliderTest extends BaseTest {

    @Test
    public void testSlider(){
        var sliderPage = homePage.clickHorizontalSlider();
        sliderPage.moveSlider(8);
        assertEquals(sliderPage.getResult(),"4");
    }
}

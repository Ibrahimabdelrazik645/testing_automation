package keypresses;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class KeyPressesTest extends BaseTest {

    @Test
    public void testBackSpace(){
        var keyPresses = homePage.clickKeyPresses();
        keyPresses.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPresses.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    public void testPi(){
        var keyPresses = homePage.clickKeyPresses();
        keyPresses.enterText(Keys.chord(Keys.ALT,Keys.NUMPAD2,Keys.NUMPAD2,Keys.NUMPAD7)+" = 3.14");
    }
}

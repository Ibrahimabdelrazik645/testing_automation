package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testForgotPassword(){
        var forgotPasswordPage =homePage.clickForgotPassword();
        forgotPasswordPage.enterEmail("ibrahim@gmail.com");
        var retrivePage = forgotPasswordPage.retrivePassword();
        assertTrue(retrivePage.getMessage().contains("Internal Server Error"),"Failed");
    }
}

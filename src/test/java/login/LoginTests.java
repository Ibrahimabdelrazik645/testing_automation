package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;
import static org.testng.Assert.*;


public class LoginTests extends BaseTest {

    @Test
    public void testSuccefulLogin(){

            LoginPage loginPage = homePage.clickFormAuthentication();
            loginPage.enterUserName("tomsmith");
            loginPage.enterPassword("SuperSecretPassword!");
            SecureArea secureArea = loginPage.clickLogin();
            assertTrue(secureArea.getStatusText().contains("You logged into a secure area!"),"Failed");


    }

}

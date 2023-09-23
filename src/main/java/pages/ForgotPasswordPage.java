package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    WebDriver driver;

    By emailElemt = By.id("email");
    By retrievePassowrd = By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailElemt).sendKeys(email);
    }

    public RetrivePage retrivePassword(){
        driver.findElement(retrievePassowrd).click();
        return new RetrivePage(driver);
    }


}

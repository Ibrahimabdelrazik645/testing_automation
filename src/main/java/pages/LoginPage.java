package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.cssSelector("form#login button.radius");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureArea clickLogin(){
        driver.findElement(loginButton).click();
        return new SecureArea(driver);
    }



}

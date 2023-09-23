package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    WebDriver driver;
    By statusText = By.id("flash");
    By logoutField = By.cssSelector("div.example> a.button");

    public SecureArea(WebDriver driver){
        this.driver = driver;
    }

    public String getStatusText(){
        return driver.findElement(statusText).getText();
    }

    public LoginPage logout(){
        driver.findElement(logoutField).click();
        return new LoginPage(driver);
    }

}

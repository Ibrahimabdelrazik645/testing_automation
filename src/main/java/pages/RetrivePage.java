package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrivePage {
    WebDriver driver;
    By message = By.cssSelector("body h1");

    public RetrivePage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessage(){
        return driver.findElement(message).getText();
    }
}

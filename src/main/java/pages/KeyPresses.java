package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    WebDriver driver;

    By inputField = By.id("target");

    By resultField = By.id("result");
    public KeyPresses(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultField).getText();
    }
}

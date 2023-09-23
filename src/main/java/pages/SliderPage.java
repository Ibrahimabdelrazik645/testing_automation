package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {
    WebDriver driver;
    By slider = By.cssSelector(".sliderContainer input");
    By result = By.id("range");

    public SliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(int steps){
        for (int i = 1 ; i <= steps ; i++)
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

}

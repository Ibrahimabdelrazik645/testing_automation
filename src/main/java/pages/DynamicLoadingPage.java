package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    WebDriver driver;
    String xpathFormat = "//a[contains(text(),'%s')]";
    By example1Link = By.xpath(String.format(xpathFormat,"Example 1"));
    By example2Link = By.xpath(String.format(xpathFormat,"Example 2"));


    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(example1Link).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2(){
        driver.findElement(example2Link).click();
        return new DynamicLoadingExample2Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2NewTab(){
        //Actions action = new Actions(driver);
        WebElement example2 = driver.findElement(example2Link);
        //action.sendKeys(example2,Keys.CONTROL).click().perform();
        example2.sendKeys(Keys.CONTROL,Keys.RETURN);
        return new DynamicLoadingExample2Page(driver);
    }


}

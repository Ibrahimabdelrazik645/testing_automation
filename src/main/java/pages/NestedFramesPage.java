package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    WebDriver driver;
    String topFrameName = "frame-top";
    String leftFrameName = "frame-left";
    String bottomFrameName = "frame-bottom";
    By framesBody = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    private void switchToTopFrame(){
        driver.switchTo().frame(topFrameName);
    }
    private void switchToLeftFrame(){
        switchToTopFrame();
        driver.switchTo().frame(leftFrameName);
    }
    private void switchToBottomFrame(){
       driver.switchTo().frame(bottomFrameName);
    }
    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromLeftFrame(){
        switchToLeftFrame();
        String text = driver.findElement(framesBody).getText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }
    public String getTextFromBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(framesBody).getText();
        switchToParentFrame();
        return text;
    }



}

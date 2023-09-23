package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    WebDriver driver;
    String frameId = "mce_0_ifr";
    By textArea = By.id("tinymce");
    By increaseIndentButton = By.cssSelector(".tox-toolbar__primary button[aria-label=\"Increase indent\"]");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromTextArea(){
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
    public void increaseIndentation(){
        driver.findElement(increaseIndentButton).click();
    }


    private void switchToTextArea(){
        driver.switchTo().frame(frameId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }


}

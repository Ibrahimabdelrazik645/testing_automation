package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    By triggerAlertButton = By.xpath("//button[.=\"Click for JS Alert\"]");
    By triggerConfirmButton = By.xpath("//button[.=\"Click for JS Confirm\"]");
    By triggerPromptButton = By.xpath("//button[.=\"Click for JS Prompt\"]");
    By result = By.id("result");

    public AlertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_enterText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}

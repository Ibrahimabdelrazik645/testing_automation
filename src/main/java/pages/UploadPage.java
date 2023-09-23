package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
    WebDriver driver;
    By inputField = By.id("file-upload");
    By uploadButton = By.id("file-submit");

    By uploadedFile = By.id("uploaded-files");

    public UploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String url){
        driver.findElement(inputField).sendKeys(url);
        clickUploadButton();
    }

    public String getUploadedFile(){
        return driver.findElement(uploadedFile).getText();
    }
}

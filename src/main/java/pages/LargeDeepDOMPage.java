package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LargeDeepDOMPage {
    WebDriver driver;
    By table = By.id("large-table");

    public LargeDeepDOMPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToTable() throws InterruptedException {
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView()";
        ((JavascriptExecutor)driver).executeScript(script,tableElement);
        Thread.sleep(Duration.ofSeconds(5));
    }
}

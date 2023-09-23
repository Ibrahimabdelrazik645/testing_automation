package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class InfiniteScrollPage {
    WebDriver driver;
    By paragraph = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * scroll until the index paragraph appears
     * @param index 1 based
     */
    public void scrollToParagraph(int index) throws InterruptedException {
        String script = "window.scroll(0,document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while (getNumberOfParagraphs() < index){
            jsExecutor.executeScript(script);
        }
        Thread.sleep(Duration.ofSeconds(5));
    }

    public int getNumberOfParagraphs(){
        return driver.findElements(paragraph).size();
    }
}

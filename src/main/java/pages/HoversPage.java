package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By figureCation = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    /*
    *@param index starts at 1
     */
    public Caption hoverOverFigure(int index){
        WebElement figureBoxElement = driver.findElements(figureBox).get(index-1);
        Actions action = new Actions(driver);
        action.moveToElement(figureBoxElement).perform();
        WebElement captionElement = figureBoxElement.findElement(figureCation);
        return new Caption(captionElement);
    }

    public class Caption{
        private WebElement captionElement;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        private Caption(WebElement captionElement){
            this.captionElement = captionElement;
        }

        public boolean isDisplayed(){
             return captionElement.isDisplayed();
        }

        public String getCaption(){
            return captionElement.findElement(header).getText();
        }

        public String getLink(){
            return captionElement.findElement(link).getAttribute("href");

        }

        public String getLinkText(){
            return captionElement.findElement(link).getText();
        }

    }

}

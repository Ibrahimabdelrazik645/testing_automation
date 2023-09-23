package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
       findDropDown().selectByVisibleText(option);
    }

    public void setMultipleOptions(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script,findDropDown());
    }



    public List<String> getSelectedOption(){
        List<WebElement> selectedElements = findDropDown().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<String>(selectedElements.size());
        for (WebElement element : selectedElements){
           selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }

    private Select findDropDown(){
        return new Select(driver.findElement(dropdown));
    }

}

package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.*;
import utils.EventReporter;
import utils.WindowManger;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.register(new EventReporter());
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void finish(){
        driver.quit();
    }


    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE){
            var camera = (TakesScreenshot)driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            Files.move(screenShot,new File("resources/screenshots/failure/"+result.getName()+".png"));
        }
    }

    /*@AfterMethod
    public void takeScreenShot(){
        var camera = (TakesScreenshot)driver;
        File screenShot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenShot, new File("resources/screenshots/test.png"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }*/

    @AfterMethod
    public void recordSuccess(ITestResult result){
        if (result.isSuccess()){
            var camera = (TakesScreenshot)driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("resources/screenshots/success/"+result.getName()+".png"));
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void retest(){
        finish();
        setUp();
    }

    public WindowManger getWindowManger(){
        return new WindowManger(driver);
    }


}


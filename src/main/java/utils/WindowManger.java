package utils;

import org.openqa.selenium.WebDriver;

public class WindowManger {
    WebDriver driver;
    WebDriver.Navigation navigate;

    public WindowManger(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public String getPageTitle(){
        return driver.getTitle();
    }

    public void switchToWindow(String tabTitle) {
        var windows = driver.getWindowHandles();

        System.out.println("The number of tabs: " + windows.size());

        System.out.println("The window handles: ");

        windows.forEach(System.out::println);

        for (String window : windows) {
            System.out.println("Switching to window: " + window);
            driver.switchTo().window(window);
            System.out.println("The current window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())) {
                break;
            }

        }
    }
        public void switchToNewWindow(){
            var windows = driver.getWindowHandles();

           // for (String window : windows)
                //driver.switchTo().window(window);

            windows.forEach(driver.switchTo()::window);
        }





}

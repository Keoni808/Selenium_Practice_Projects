/*
  There are 3 different ways to switch windows
    1. driver.switchTo().window("windowName");
    2. driver.switchTo().frame("frameName");
    3. driver.switchTo().alert();
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keoni/downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();
        //Although a new tab is open and displaying, the driver is on the other webpage.

        //Gets the handle for the original website
        String originalHandle = driver.getWindowHandle();

        //this for loop switches to the second tab that is open.
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);

        //driver.quit();
    }
}

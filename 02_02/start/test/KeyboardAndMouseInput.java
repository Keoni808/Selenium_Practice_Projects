import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keoni/downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        //Goes to specified website
        driver.get("https://formy-project.herokuapp.com/keypress");

        //finds element by id "name"
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Keoni Mortensen");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}

/*Auto completes a form.
1. Accesses chromedriver on local machine.
2. Creates a WebDriver object.
3. The WebDriver object goes to specific website
4.0 Finds element within website that has an id of "autocomplete"
4.1 This element is a form that we need to enter keys in.
5. Once on the form, types in an address.
6. Waits 1000 milliseconds for website to load results
7. Clicks on result to fill out rest of the form.
8. Waits 2 seconds then closes browser
 */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/keoni/downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("15555 Park Blvd, Palo Alto, CA");
        //gives time for the website to respond. Without this, the results do not have time to come up.
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        Thread.sleep(1000);

        driver.quit();
    }
}

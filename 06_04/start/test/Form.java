import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/keoni/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);

        ConfimationPage confimationPage = new ConfimationPage();
        confimationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!",
                confimationPage.getAlertBannerText(driver));

        driver.quit();
    }
}

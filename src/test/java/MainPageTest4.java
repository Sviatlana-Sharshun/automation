import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageTest4 {
    @Test
    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "/Users/sveta/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.close();
    }
}

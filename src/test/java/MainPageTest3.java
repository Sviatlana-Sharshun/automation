import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static com.codeborne.selenide.Selenide.*;


public class MainPageTest3 {
    @Test
    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "/Users/sveta/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        WebDriverRunner.setWebDriver(driver);
        open("http://automationpractice.com/index.php");
    }
}

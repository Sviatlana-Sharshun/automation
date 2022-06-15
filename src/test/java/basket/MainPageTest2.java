package basket;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest2 {
    @Test
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/sveta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.close();
    }
}

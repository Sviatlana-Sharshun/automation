package basket;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPageTest6 {
    @Test
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "/Users/sveta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        String expectedTitle = "My Store";
        String actualTitle = driver.getTitle();
        if (expectedTitle.contentEquals(actualTitle)) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
        driver.close();
    }
}

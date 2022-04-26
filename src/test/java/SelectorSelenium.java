import com.codeborne.selenide.impl.WebElementsCollectionWrapper;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectorSelenium {
    @Test
    public void openSelectorId() {
        System.setProperty("webdriver.chrome.driver", "/Users/sveta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(new By.ById("slider_row")).click();
        driver.close();
    }
    @Test
    public void openSelectorClass() {
        System.setProperty("webdriver.chrome.driver", "/Users/sveta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(new By.ByClassName("login")).click();
        String name = driver.getCurrentUrl();
        if (name.contentEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account")) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
        driver.close();
    }
    @Test
    public void openSelectorCss() {
        System.setProperty("webdriver.chrome.driver", "/Users/sveta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element = driver.findElement(new By.ByCssSelector("#contact-link > a"));
        String elvalue = element.getCssValue("display");
        if (elvalue.contentEquals("block")){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        driver.close();
    }
    @Test
    public void openSelectorXpath() {
        System.setProperty("webdriver.chrome.driver", "/Users/sveta/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element = driver.findElement(By.xpath("//input[@name='search_query']"));
        element.sendKeys("dress", Keys.ENTER);
        driver.close();
    }
    }


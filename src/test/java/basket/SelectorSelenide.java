package basket;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelectorSelenide {
    @Test
    public void openSelectorId() {
        Selenide.open("http://automationpractice.com/index.php?controller=contact");
        $(By.id("submitMessage")).click();
        $("#center_column > div > p").shouldHave(Condition.text("There is 1 error"));
    }
    @Test
    public void openSelectorClass() {
        Selenide.open("http://automationpractice.com/index.php");
        $(By.className("ajax_cart_no_product")).shouldHave(Condition.text("(empty)"));

    }
    @Test
    public void openSelectorCss() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".bx-prev").click();

    }
    @Test
    public void openSelectorXpath() {
        Selenide.open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        SelenideElement element = $(By.xpath("//input[@id='email_create']"));
        element.sendKeys("test@gmail.com", Keys.ENTER);
    }
    @Test
    public void openSelectorXpaths() {
        Selenide.open("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        SelenideElement element = $(By.xpath("//input[@id='email_create']"));
        element.sendKeys("test@gmail.com", Keys.ENTER);
        ElementsCollection elements = $$("");
    }

}

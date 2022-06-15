package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderHistoryPage {
    private static SelenideElement productText = $("td.bold > label");

    public static void clickFindText(String orderName) {
        $(By.linkText(orderName)).click();
    }

    public static String getProductText() {
        return productText.getText();
    }
}

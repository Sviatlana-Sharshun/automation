package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrderPaymentPage {
    private static SelenideElement payByBank = $(".bankwire");

    public static void clickPayByBank() {
        payByBank.click();
    }
}

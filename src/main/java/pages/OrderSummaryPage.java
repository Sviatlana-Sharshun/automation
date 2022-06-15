package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrderSummaryPage {

    private static SelenideElement proceedToCheckout = $(".standard-checkout.button-medium");

    public static void clickProceedToCheckoutSummary() {
        proceedToCheckout.click();
    }
}

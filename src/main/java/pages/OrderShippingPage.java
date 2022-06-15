package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrderShippingPage {
    private static SelenideElement checkbox = $("#cgv");
    private static SelenideElement proceedToCheckout = $(".standard-checkout.button-medium");

    public static void clickProceedToCheckoutShipping() {
        checkbox.click();
        proceedToCheckout.click();
    }
}

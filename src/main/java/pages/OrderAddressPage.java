package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class OrderAddressPage {

    private static SelenideElement proceedToCheckout = $("p > button");

    public static void clickProceedToCheckoutAddress() {
        proceedToCheckout.click();
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DressesCasualPage {

    private static SelenideElement imgDress = $("a.product_img_link > img");
    private static SelenideElement addToCart = $(".ajax_add_to_cart_button");
    private static SelenideElement proceedToCheckout = $("a.button-medium");

    public static void clickAddToCartDress() {
        imgDress.hover();
        addToCart.click();
    }

    public static void clickProceedToCheckout() {
        proceedToCheckout.click();
    }
}

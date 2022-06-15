package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WomenProductPage {

    private static SelenideElement wishlist = $("#wishlist_button");
    private static SelenideElement boxClose = $(".fancybox-close");

    public static void addToWishlist() {
        wishlist.click();
        boxClose.click();
    }
}

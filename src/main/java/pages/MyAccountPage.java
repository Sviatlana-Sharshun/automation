package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountPage {
    private static SelenideElement myWishlists = $(".lnk_wishlist");

    public static void clickMyWishlists(){
        myWishlists.click();
    }
}

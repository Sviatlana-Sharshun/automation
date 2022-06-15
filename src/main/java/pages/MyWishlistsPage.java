package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MyWishlistsPage {
    private static SelenideElement deleteWishlist = $(".icon-remove");
    private static SelenideElement wishlistTable = $(".table-bordered");

    public static void clickDeleteWishlist() {
        deleteWishlist.click();
    }

    public static void notFoundWishlistTable() {
        wishlistTable.should(Condition.disappear);
    }

    public static boolean displayedWishlistTable() {
        return wishlistTable.isDisplayed();
    }
}

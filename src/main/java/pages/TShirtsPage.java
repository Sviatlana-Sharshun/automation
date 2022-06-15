package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TShirtsPage {

    private static SelenideElement tShirtsName = $("[itemprop='name']");
    private static SelenideElement more = $(".lnk_view.btn");

    public static void clickMoreTShirts() {
        tShirtsName.hover();
        more.click();
    }
}

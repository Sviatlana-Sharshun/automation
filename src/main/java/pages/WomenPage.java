package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WomenPage {

    private static SelenideElement tops = $("#categories_block_left > div > ul > li:nth-child(1)");
    private static SelenideElement nameBlouse = $(".product-name[title='Blouse']");
    private static SelenideElement more = $(".last-item-of-tablet-line .lnk_view");

    public static void clickTops() {
        tops.click();
    }

    public static void clickMoreBlouse() {
        nameBlouse.hover();
        more.click();
    }
}

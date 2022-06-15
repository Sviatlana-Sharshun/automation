package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DressesPage {

    private static SelenideElement casualDresses = $("#categories_block_left li:nth-child(1)");
    private static SelenideElement summerDresses = $("#categories_block_left > div > ul > li.last > a");

    public static void clickCasualDresses() {
        casualDresses.click();
    }

    public static void clickSummerDresses() {
        summerDresses.click();
    }
}

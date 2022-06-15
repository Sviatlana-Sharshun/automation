package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DressesProductPage {

    private static SelenideElement colorBlack = $("#color_11");
    private static SelenideElement colorOrange = $("#color_13");
    private static SelenideElement colorBlue = $("#color_14");
    private static SelenideElement colorYellow = $("#color_16");

    public static void clickColorBlack() {
        colorBlack.click();
    }

    public static void clickColorOrange() {
        colorOrange.click();
    }

    public static void clickColorBlue() {
        colorBlue.click();
    }

    public static void clickColorYellow() {
        colorYellow.click();
    }
}

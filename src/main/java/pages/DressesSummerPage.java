package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DressesSummerPage {

    private static SelenideElement blockDress = $("li:nth-child(1) .right-block");
    private static SelenideElement more = $("li:nth-child(1) .lnk_view.btn-default > span");

    public static void clickMoreDressSummer() {
        blockDress.hover();
        more.click();
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ContactUsSentPage {

    private static SelenideElement successfullyText = $(".alert-success");

    public static String getSuccessfullyText() {
        return successfullyText.getText();
    }
}

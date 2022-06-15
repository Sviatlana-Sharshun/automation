package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsPage {

    private static SelenideElement subject = $("#id_contact");
    private static SelenideElement service = $("#id_contact > option:nth-child(2)");
    private static SelenideElement reference = $("div:nth-child(6) > div > select");
    private static SelenideElement product = $("select[style$='inline-block;']");
    private static SelenideElement message = $("#message");
    private static SelenideElement send = $("#submitMessage");


    public static void choiceService() {
        subject.click();
        service.click();
    }

    public static void clickReference() {
        reference.click();
    }

    public static void clickVisibleElement(String element) {
        $(withText(element)).shouldBe(Condition.visible).click();
    }

    public static void clickProduct() {
        product.click();
    }

    public static void setMessage(String messageText) {
        message.setValue(messageText);
    }

    public static void sendMessage() {
        send.click();
    }
}

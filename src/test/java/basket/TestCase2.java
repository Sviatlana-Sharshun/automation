package basket;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TestCase2 {
    @Test
    public void qase2() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email_create").sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        $("#SubmitCreate").click();
        $("#id_gender2").click();
        $("#customer_firstname").sendKeys("Test");
        $("#customer_lastname").sendKeys("Test");
        $("#passwd").sendKeys("12345");
        $("#days").click();
        $("#days > option:nth-child(2)").click();
        $("#months").click();
        $("#months > option:nth-child(2)").click();
        $("#years").click();
        $("#years > option:nth-child(4)").click();
        $("#newsletter").click();
        $("#optin").click();
        $("#company").sendKeys("Kaseya");
        $("#address1").sendKeys("701 Brickell Avenue");
        $("#address2").sendKeys("2");
        $("#city").sendKeys("Miami");
        $("#id_state").click();
        $("#id_state > option:nth-child(11)").click();
        $("#postcode").sendKeys("33131");
        $("#id_country").click();
        $("#id_country > option:nth-child(2)").click();
        $("#other").sendKeys("Additional information");
        $("#phone").sendKeys("+375292929297");
        $("#phone_mobile").sendKeys("+375333333333");
        $("#alias").clear();
        $("#alias").sendKeys("18, Baker street");
        $("#submitAccount").click();
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $("#categories_block_left > div > ul > li:nth-child(1)").click();
        $("a.product_img_link > img").hover();
        $(".ajax_add_to_cart_button.btn.btn-default").click();
        $(".btn-default.button.button-medium").click();
        $(".standard-checkout.button-medium").click();
        $("p > button").click();
        $("#cgv").click();
        $(".standard-checkout.button-medium").click();
        $(".bankwire").click();
        $("#cart_navigation > button").click();
        String order = $(".box").getText();
        order = StringUtils.substringBefore(order, " in the");
        order = StringUtils.substringAfter(order, "reference ");
        $(".button-exclusive.btn.btn-default").click();
        $(By.linkText(order)).click();
        String product = $("td.bold > label").getText();
        $("#contact-link").click();
        $("#id_contact").click();
        $("#id_contact > option:nth-child(2)").click();
        $("div:nth-child(6) > div > select").click();
//        $("div:nth-child(6) > div > select > option:nth-child(2)").click();
//        $x("//*[contains(text(), '" + order + "']");
        $(withText(order)).shouldBe(Condition.visible).click();
        $("select[style$='inline-block;']").click();
        $(withText(product)).shouldBe(Condition.visible).click();
//        $(By.linkText(product)).click();
//        $("[style='display: inline-block;'] > option:nth-child(2)").click();
//        $(By.partialLinkText("Printed Dress")).click();
        $("#message").sendKeys("I have a problem with my order. Could you help me?");
        $("#submitMessage").click();
        $(".alert.alert-success")
                .shouldHave(Condition.text("Your message has been successfully sent to our team."));
    }
}

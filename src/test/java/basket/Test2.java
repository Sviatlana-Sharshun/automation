package basket;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test2 {
    @Test
    public void qase1() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $("#categories_block_left li:nth-child(1)").click();
        $("a.product_img_link > img").hover();
        $(".ajax_add_to_cart_button").click();
        $("a.button-medium").click();
        $(".standard-checkout.button-medium").click();
        $("p > button").click();
        $("#cgv").click();
        $(".standard-checkout.button-medium").click();
        $(".bankwire").click();
        $("#cart_navigation > button").click();
        $(".page-heading").shouldHave(Condition.text("Order confirmation"));
//        assertEquals("ORDER CONFIRMATION", $(".page-heading").getText());
        $(".logout").click();
    }

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
        $("#categories_block_left li:nth-child(1)").click();
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
//        List<WebElement> refnumber = driver.findElements(By.cssSelector("div:nth-child(6) > div > select"));
//        for (WebElement option : refnumber) {
//            if (option.getText().contains(number)) {
//                option.click();
//                break;
//            }
//        }
        $("div:nth-child(6) > div > select").click();
        $(withText(order)).shouldBe(Condition.visible).click();
        $("select[style$='inline-block;']").click();
        $(withText(product)).shouldBe(Condition.visible).click();
        $("#message").sendKeys("I have a problem with my order. Could you help me?");
        $("#submitMessage").click();
        $(".alert-success")
                .shouldHave(Condition.text("Your message has been successfully sent to our team."));
//        assertEquals("Your message has been successfully sent to our team.", $(".alert-success").getText());
        $(".logout").click();
    }

    @Test
    public void qase3() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(3)").click();
        $("[itemprop='name']").hover();
        $(".lnk_view.btn").click();
        $("li a.open-comment-form").click();
        $("a[title = '5']").click();
        $("#comment_title").sendKeys("High quality product");
        $("#content")
                .sendKeys("Faded short sleeve t-shirt with high neckline. " +
                        "Soft and stretchy material for a comfortable fit. " +
                        "Accessorize with a straw hat and you're ready for summer!");
        $("#submitNewMessage").click();
        $("#new_comment_form").should(Condition.disappear);
        assertEquals("New comment\n" +
                        "Your comment has been added and will be available once approved by a moderator\n" +
                        "\n" +
                        "OK",
                $(".fancybox-inner").getText());
        $("button.button-medium").click();
        $(".logout").click();
    }

    @Test
    public void qase4() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("[title = 'Women']").click();
        $("#categories_block_left > div > ul > li:nth-child(1)").click();
        $(".product-name[title='Blouse']").hover();
        $(".last-item-of-tablet-line .lnk_view").click();
        $("#wishlist_button").click();
        $(".fancybox-close").click();
        $(".account").click();
        $(".lnk_wishlist").click();
//        $("#block-history td:nth-child(1) > a").click();
        $(".icon-remove").click();
        Selenide.switchTo().alert().accept();
        $(".table-bordered").should(Condition.disappear);
//        $(".icon-remove-sign").click();
//
//        $("#block-history td:nth-child(1) > a").click();
//        $(".alert.alert-warning").shouldHave(Condition.text("No products"));
//       assertEquals("No products", $(".alert.alert-warning").getText());
//        $(".logout").click();
    }

    @Test
    public void qase5() {
        Selenide.open("http://automationpractice.com/index.php");
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $("#categories_block_left > div > ul > li.last > a").click();
        $("li:nth-child(1) .right-block").hover();
        $("li:nth-child(1) .lnk_view.btn-default > span").click();
        $("#color_11").click();
        $("#color_13").click();
        $("#color_14").click();
        $("#color_16").click();
        WebDriverRunner driverRunner = new WebDriverRunner();
        String url = driverRunner.url();
//        assertEquals(
//                "http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-yellow",
//                url);
        if (url.contains("yellow")) {
            System.out.println("Цвет соответствует");
        } else {
            System.out.println("Цвет не соответствует");
        }
    }
}
package basket;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Case4 {
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
        Assertions.assertFalse($(".table-bordered").isDisplayed());
//        Assertions.assertTrue($(".table-bordered").isDisplayed());
//        Assertions.assertTrue($(".table-bordered").has(Condition.disappear));
//        $(".table-bordered").should(Condition.disappear);
//        $(".icon-remove-sign").click();
//
//        $("#block-history td:nth-child(1) > a").click();
//        $(".alert.alert-warning").shouldHave(Condition.text("No products"));
//       assertEquals("No products", $(".alert.alert-warning").getText());
//        $(".logout").click();
    }
}
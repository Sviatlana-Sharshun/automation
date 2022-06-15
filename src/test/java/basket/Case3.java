package basket;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Case3 {
    @Test
    public void qase3 (){
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(3)").click();
        $("[itemprop='name']").hover();
        $(".lnk_view.btn.btn-default").click();
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
        $("button.button.btn-default.button-medium").click();
    }
}
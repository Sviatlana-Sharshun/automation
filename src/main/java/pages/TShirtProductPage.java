package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TShirtProductPage {

    private static SelenideElement review = $("li a.open-comment-form");
    private static SelenideElement quality5 = $("a[title = '5']");
    private static SelenideElement title = $("#comment_title");
    private static SelenideElement comment = $("#content");
    private static SelenideElement newCommentForm = $("#new_comment_form");
    private static SelenideElement submitNewMessage = $("#submitNewMessage");
    private static SelenideElement newComment = $(".fancybox-inner");
    private static SelenideElement buttonOK = $("button.button-medium");

    public static void clickReview() {
        review.click();
    }

    public static void sendComment(String titleText, String commentText) {
        quality5.click();
        title.setValue(titleText);
        comment.setValue(commentText);
        submitNewMessage.click();
    }

    public static void notFoundCommentForm() {
        newCommentForm.should(Condition.disappear);
    }

    public static String getTextNewCommentWindow() {
        return newComment.getText();
    }

    public static void clickOkNewCommentWindow() {
        buttonOK.click();
    }
}

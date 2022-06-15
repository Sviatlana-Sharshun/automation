package tests;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ui.Feature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.ContactUsPage.*;
import static pages.ContactUsSentPage.getSuccessfullyText;
import static pages.CreateAccountPage.createAccount;
import static pages.DressesCasualPage.clickAddToCartDress;
import static pages.DressesCasualPage.clickProceedToCheckout;
import static pages.DressesPage.clickCasualDresses;
import static pages.DressesPage.clickSummerDresses;
import static pages.DressesProductPage.*;
import static pages.DressesSummerPage.clickMoreDressSummer;
import static pages.LoginPage.create;
import static pages.LoginPage.login;
import static pages.MainPage.*;
import static pages.MyAccountPage.clickMyWishlists;
import static pages.MyWishlistsPage.*;
import static pages.OrderAddressPage.clickProceedToCheckoutAddress;
import static pages.OrderConfirmPage.*;
import static pages.OrderHistoryPage.clickFindText;
import static pages.OrderHistoryPage.getProductText;
import static pages.OrderPaymentPage.clickPayByBank;
import static pages.OrderShippingPage.clickProceedToCheckoutShipping;
import static pages.OrderSummaryPage.clickProceedToCheckoutSummary;
import static pages.TShirtProductPage.*;
import static pages.TShirtsPage.clickMoreTShirts;
import static pages.WomenPage.*;
import static pages.WomenProductPage.addToWishlist;
import static service.ui.ScreenshotService.uiExecutor;
import static utils.RandomEmail.randomEmail;

@Owner(value = "Sharshun Sviatlana")
public class TestCases extends BaseTest {

    @Test
    @Description(value = "Checks the order")
    public void orderCasualDress() {
        clickSignIn();
        login(EMAIL, PASSWD);
        clickDressesMenu();
        clickCasualDresses();
        clickAddToCartDress();
        clickProceedToCheckout();
        clickProceedToCheckoutSummary();
        clickProceedToCheckoutAddress();
        clickProceedToCheckoutShipping();
        clickPayByBank();
        clickConfirmOrder();
        assertEquals(ORDER, getTextOrderTitle());
    }

    @Test
    @Description(value = "Check sending message to customer service")
    public void sendEmailCustomerService() {
        clickSignIn();
        create(randomEmail());
        createAccount("Ivan",
                "Ivanov",
                "12345",
                "Kaseya",
                "701 Brickell Avenue",
                "Miami",
                "33131",
                "Additional information",
                "+375292929297",
                "+375333333333",
                "18, Baker street");
        clickDressesMenu();
        clickCasualDresses();
        clickAddToCartDress();
        clickProceedToCheckout();
        clickProceedToCheckoutSummary();
        clickProceedToCheckoutAddress();
        clickProceedToCheckoutShipping();
        clickPayByBank();
        clickConfirmOrder();
        String order = getOrder();
        backToOrdersHistory();
        clickFindText(order);
        String product = getProductText();
        clickContactUs();
        choiceService();
        clickReference();
        clickVisibleElement(order);
        clickProduct();
        clickVisibleElement(product);
        setMessage(MESSAGE_TEXT);
        sendMessage();
        assertEquals(SENT_TEXT, getSuccessfullyText());
    }

    @Test
    @Description(value = "Checking the submission of product feedback")
    public void writeReview() {
        clickSignIn();
        login(EMAIL, PASSWD);
        clickTShirtsMenu();
        clickMoreTShirts();
        clickReview();
        sendComment(TITLE_COMMIT_TEXT, SEND_COMMIT_TEXT);
        notFoundCommentForm();
        assertEquals(COMMENT_TEXT, getTextNewCommentWindow());
        clickOkNewCommentWindow();
    }

    @Test
    @Description(value = "Checking removal from favorites")
    public void addWishlist() {
        clickSignIn();
        login(EMAIL, PASSWD);
        clickWomenMenu();
        clickTops();
        clickMoreBlouse();
        addToWishlist();
        clickAccount();
        clickMyWishlists();
        clickDeleteWishlist();
        Selenide.switchTo().alert().accept();
        notFoundWishlistTable();
        Assertions.assertFalse(displayedWishlistTable());
    }

    @Test
    @Description(value = "Checks the color of the dress in the card")
    public void displayForDifferentDressColor() {
        clickDressesMenu();
        clickSummerDresses();
        clickMoreDressSummer();
        clickColorBlack();
        clickColorOrange();
        clickColorBlue();
        clickColorYellow();
        uiExecutor(Feature.EXAMPLE);
        WebDriverRunner driverRunner = new WebDriverRunner();
        String url = driverRunner.url();
        assertTrue(url.contains(URL_COLOR));
    }
}

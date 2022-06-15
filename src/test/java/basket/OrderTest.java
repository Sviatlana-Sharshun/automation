//import base.BaseTest;
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.private static SelenideElement;
//import com.codeborne.selenide.WebDriverRunner;
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.commons.lang.StringUtils;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import pages.MainPage;
//
//import static com.codeborne.selenide.Selectors.withText;
//import static com.codeborne.selenide.Selenide.$;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class OrderTest extends BaseTest {
//
//
//    public final static String BASE_URL = "http://automationpractice.com/index.php";
//    public final static String EMAIL = "pkotot@mailto.plus";
//    public final static String PASSWD = "12345";
//    public final static String ORDER = "ORDER CONFIRMATION";
//
//
//    @Test
//    public void orderCasualDress() {
//        MainPage mainPage = new MainPage();
////        mainPage.openWebSite(BASE_URL);
//        mainPage.clickLogin();
//
//
//        public void orderCasualDress () {
//            Selenide.open("http://automationpractice.com/index.php");
////MainPage
//            private static SelenideElement signIn = $(".login");
////LoginPage
//            private static SelenideElement userEmail = $("#email");
//            private static SelenideElement passwd = $("#passwd");
//            private static SelenideElement submitLogin = $("#SubmitLogin");
////MainPage
//            private static SelenideElement dressesMenu= $("#block_top_menu > ul > li:nth-child(2) > a");
////DressesPage
//            private static SelenideElement casualDresses = $("#categories_block_left li:nth-child(1)");
////DressesCasualPage
//            private static SelenideElement imgDress = $("a.product_img_link > img");
//            private static SelenideElement addToCart = $(".ajax_add_to_cart_button");
//            private static SelenideElement proceedToCheckout = $("a.button-medium");
//
////OrderSummaryPage
//            private static SelenideElement proceedToCheckout = $(".standard-checkout.button-medium");
////OrderAddressPage
//            private static SelenideElement proceedToCheckout = $("p > button");
////OrderShippingPage
//            private static SelenideElement checkbox = $("#cgv");
//            private static SelenideElement proceedToCheckout = $(".standard-checkout.button-medium");
////OrderPaymentPage
//            private static SelenideElement payByBank = $(".bankwire");
////OrderConfirmPage
//            private static SelenideElement confirmOrder = $("#cart_navigation > button");
//            private static SelenideElement orderTitle = $(".page-heading");
//            assertEquals("ORDER CONFIRMATION", $(".page-heading").getText());
//
//
//            private static SelenideElement genderwoman = $(".logout");
//        }
//
//        @Test
//        public void sendEmailCustomerService () {
//            Selenide.open("http://automationpractice.com/index.php");
////MainPage
//            private static SelenideElement signIn = $(".login");
////LoginPage
//            private static SelenideElement emailCreate = $("#email_create");
//            private static SelenideElement submitCreate = $("#SubmitCreate");
////CreateAccountPage
//            private static SelenideElement genderWoman = $("#id_gender2");
//            private static SelenideElement firstname = $("#customer_firstname");
//            private static SelenideElement lastname = $("#customer_lastname");
//            private static SelenideElement passwd = $("#passwd");
//            private static SelenideElement days = $("#days");
//            private static SelenideElement dropdownDays = $("#days > option:nth-child(2)");
//            private static SelenideElement months = $("#months");
//            private static SelenideElement dropdownMonths = $("#months > option:nth-child(2)");
//            private static SelenideElement years = $("#years");
//            private static SelenideElement dropdownYears = $("#years > option:nth-child(4)");
//            private static SelenideElement newsLetter = $("#newsletter");
//            private static SelenideElement offersCheckbox = $("#optin");
//            private static SelenideElement company = $("#company");
//            private static SelenideElement address1 = $("#address1");
//            private static SelenideElement address2 = $("#address2");
//            private static SelenideElement city = $("#city");
//            private static SelenideElement state = $("#id_state");
//            private static SelenideElement dropdownState = $("#id_state > option:nth-child(11)");
//            private static SelenideElement postcode = $("#postcode");
//            private static SelenideElement country = $("#id_country");
//            private static SelenideElement dropdownCountry = $("#id_country > option:nth-child(2)");
//            private static SelenideElement otherInfo = $("#other");
//            private static SelenideElement phone = $("#phone");
//            private static SelenideElement mobilePhone = $("#phone_mobile");
//            private static SelenideElement aliasAddress = $("#alias");
//            private static SelenideElement register = $("#submitAccount");
////MainPage
//            private static SelenideElement dressesMenu = $("#block_top_menu > ul > li:nth-child(2) > a");
//
////DressesPage
//            private static SelenideElement casualDresses = $("#categories_block_left li:nth-child(1)");
////DressesCasualPage
//            private static SelenideElement imgDress = $("a.product_img_link > img");
//            private static SelenideElement addToCart = $(".ajax_add_to_cart_button");
//            private static SelenideElement proceedToCheckout = $("a.button-medium");
//
////OrderSummaryPage
//            private static SelenideElement proceedToCheckout = $(".standard-checkout.button-medium");
////OrderAddressPage
//            private static SelenideElement proceedToCheckout = $("p > button");
////OrderShippingPage
//            private static SelenideElement checkbox = $("#cgv");
//            private static SelenideElement proceedToCheckout = $(".standard-checkout.button-medium");
////OrderPaymentPage
//            private static SelenideElement payByBank = $(".bankwire");
////OrderConfirmPage
//            private static SelenideElement confirmOrder = $("#cart_navigation > button");
//            private static SelenideElement boxOrder = $(".box");
//            String order = boxOrder.getText();
//            order = StringUtils.substringBefore(order, " in the");
//            order = StringUtils.substringAfter(order, "reference ");
//            private static SelenideElement backToOrders = $(".button-exclusive");
////OrderHistoryPage
//            private static SelenideElement orderName = $(By.linkText(order));
//            String product = $("td.bold > label").getText();
////MainPage
//            private static SelenideElement contactUs = $("#contact-link");
////ContactUsPage
//            private static SelenideElement subject = $("#id_contact");
//            private static SelenideElement service = $("#id_contact > option:nth-child(2)");
//            private static SelenideElement reference = $("div:nth-child(6) > div > select");
//            private static SelenideElement cod = $(withText(order)).shouldBe(Condition.visible);
//            private static SelenideElement productVisible = $("select[style$='inline-block;']");
//            private static SelenideElement productName = $(withText(product)).shouldBe(Condition.visible);
//            private static SelenideElement message = $("#message");
//            private static SelenideElement send = $("#submitMessage");
////ContactUsSentPage
//            private static SelenideElement genderwoman = $(".alert-success");
//
//
//            assertEquals("Your message has been successfully sent to our team.", private static SelenideElement genderwoman = $(".alert-success")
//                    .getText());
//            private static SelenideElement genderwoman = $(".logout");
//        }
//
//        @Test
//        public void writeReview () {
//            Selenide.open("http://automationpractice.com/index.php");
////MainPage
//            private static SelenideElement signIn = $(".login");
////LoginPage
//            private static SelenideElement userEmail = $("#email");
//            private static SelenideElement passwd = $("#passwd");
//            private static SelenideElement submitLogin = $("#SubmitLogin");
////MainPage
//            private static SelenideElement tShirtsMenu = $("#block_top_menu > ul > li:nth-child(3)");
////TShirtsPage
//            private static SelenideElement tShirtsName = $("[itemprop='name']");
//            private static SelenideElement more = $(".lnk_view.btn");
////TShirtProductPage
//            private static SelenideElement review = $("li a.open-comment-form");
//            private static SelenideElement quality5 = $("a[title = '5']");
//            private static SelenideElement title = $("#comment_title");
//            private static SelenideElement comment = $("#content");
//                    .sendKeys("Faded short sleeve t-shirt with high neckline. " +
//                            "Soft and stretchy material for a comfortable fit. " +
//                            "Accessorize with a straw hat and you're ready for summer!");
//            private static SelenideElement send = $("#submitNewMessage");
////Window
//            private static SelenideElement newCommentForm = $("#new_comment_form").should(Condition.disappear);
//            private static SelenideElement newComment = $(".fancybox-inner");
//            assertEquals("New comment\n" +
//                            "Your comment has been added and will be available once approved by a moderator\n" +
//                            "\n" +
//                            "OK", newComment.getText());
//            private static SelenideElement buttonOK = $("button.button-medium");
//
//
//            private static SelenideElement genderwoman = $(".logout");
//
//        }
//
//        @Test
//        public void addWishlist () {
//            Selenide.open("http://automationpractice.com/index.php");
////MainPage
//            private static SelenideElement signIn = $(".login");
////LoginPage
//            private static SelenideElement userEmail = $("#email");
//            private static SelenideElement passwd = $("#passwd");
//            private static SelenideElement submitLogin = $("#SubmitLogin");
////MainPage
//            private static SelenideElement womenMenu = $("[title = 'Women']");
////WomenPage
//            private static SelenideElement tops = $("#categories_block_left > div > ul > li:nth-child(1)");
//            private static SelenideElement nameBlouse = $(".product-name[title='Blouse']");
//            private static SelenideElement more = $(".last-item-of-tablet-line .lnk_view");
////WomenProductPage
//            private static SelenideElement wishlist = $("#wishlist_button");
////window
//            private static SelenideElement boxClose = $(".fancybox-close");
////MainPage
//            private static SelenideElement genderwoman = $(".account");
////MyAccountPage
//            private static SelenideElement myWishlists = $(".lnk_wishlist");
////MyWishlistsPage
//            private static SelenideElement deleteWishlist = $(".icon-remove");
//            Selenide.switchTo().alert().accept();
//            private static SelenideElement wishlistTable = $(".table-bordered");
//
//            private static SelenideElement genderwoman = $(".table-bordered").should(Condition.disappear);
//            Assertions.assertFalse(private static SelenideElement genderwoman = $(".table-bordered").isDisplayed());
//
//
//            private static SelenideElement genderwoman = $(".logout");
//        }
//
//        @Test
//        public void displayDifferentDressColor () {
//            Selenide.open("http://automationpractice.com/index.php");
////MainPage
//            private static SelenideElement dressesMenu = $("#block_top_menu > ul > li:nth-child(2) > a");
////DressesPage
//            private static SelenideElement dressesSummer = $("#categories_block_left > div > ul > li.last > a");
////DressesSummerPage
//            private static SelenideElement blockDress = $("li:nth-child(1) .right-block");
//            private static SelenideElement more = $("li:nth-child(1) .lnk_view.btn-default > span");
////DressesProductPage
//            private static SelenideElement colorBlack = $("#color_11");
//            private static SelenideElement colorOrange = $("#color_13");
//            private static SelenideElement colorBlue = $("#color_14");
//            private static SelenideElement colorYellow = $("#color_16");
//            WebDriverRunner driverRunner = new WebDriverRunner();
//            String url = driverRunner.url();
//            assertEquals(
//                    "http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-yellow",
//                    url);
//    }
//}

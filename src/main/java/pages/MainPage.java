package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

/**
 * Главная страница сайта http://automationpractice.com/index.php
 */

public class MainPage {

    private static SelenideElement signIn = $(".login");
    private static SelenideElement dressesMenu = $("#block_top_menu > ul > li:nth-child(2) > a");
    private static SelenideElement contactUs = $("#contact-link");
    private static SelenideElement tShirtsMenu = $("#block_top_menu > ul > li:nth-child(3)");
    private static SelenideElement womenMenu = $("[title = 'Women']");
    private static SelenideElement account = $(".account");

    public static void clickSignIn() {
        signIn.click();
    }

    public static void clickDressesMenu() {
        dressesMenu.click();
    }

    public static void clickContactUs() {
        contactUs.click();
    }

    public static void clickWomenMenu(){
        womenMenu.click();
    }
    public static void clickAccount(){
        account.click();
    }
    public static void clickTShirtsMenu(){
        tShirtsMenu.click();
    }
}

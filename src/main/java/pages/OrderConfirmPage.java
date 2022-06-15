package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.StringUtils;

import static com.codeborne.selenide.Selenide.$;

public class OrderConfirmPage {
    private static SelenideElement confirmOrder = $("#cart_navigation > button");
    private static SelenideElement orderTitle = $(".page-heading");
    private static SelenideElement boxOrder = $(".box");
    private static SelenideElement backToOrders = $(".button-exclusive");

    public static void clickConfirmOrder() {
        confirmOrder.click();
    }

    public static String getTextOrderTitle() {
        return orderTitle.getText();
    }

    public static String getOrder() {
        String order = boxOrder.getText();
        order = StringUtils.substringBefore(order, " in the");
        order = StringUtils.substringAfter(order, "reference ");
        return order;
    }

    public static void backToOrdersHistory() {
        backToOrders.click();
    }
}

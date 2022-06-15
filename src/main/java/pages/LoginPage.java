package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static SelenideElement userEmail = $("#email");
    private static SelenideElement passwd = $("#passwd");
    private static SelenideElement submitLogin = $("#SubmitLogin");
    private static SelenideElement emailCreate = $("#email_create");
    private static SelenideElement submitCreate = $("#SubmitCreate");

    public static void login(String user, String pwd) {
        userEmail.setValue(user);
        passwd.setValue(pwd);
        submitLogin.click();
    }

    public static void create(String user) {
        emailCreate.setValue(user);
        submitCreate.click();
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    private static SelenideElement genderWoman = $("#id_gender2");
    private static SelenideElement firstname = $("#customer_firstname");
    private static SelenideElement lastname = $("#customer_lastname");
    private static SelenideElement passwd = $("#passwd");
    private static SelenideElement days = $("#days");
    private static SelenideElement dropdownDays = $("#days > option:nth-child(2)");
    private static SelenideElement months = $("#months");
    private static SelenideElement dropdownMonths = $("#months > option:nth-child(2)");
    private static SelenideElement years = $("#years");
    private static SelenideElement dropdownYears = $("#years > option:nth-child(4)");
    private static SelenideElement newsLetter = $("#newsletter");
    private static SelenideElement offersCheckbox = $("#optin");
    private static SelenideElement company = $("#company");
    private static SelenideElement address1 = $("#address1");
    private static SelenideElement city = $("#city");
    private static SelenideElement state = $("#id_state");
    private static SelenideElement dropdownState = $("#id_state > option:nth-child(11)");
    private static SelenideElement postcode = $("#postcode");
    private static SelenideElement country = $("#id_country");
    private static SelenideElement dropdownCountry = $("#id_country > option:nth-child(2)");
    private static SelenideElement otherInfo = $("#other");
    private static SelenideElement phone = $("#phone");
    private static SelenideElement mobilePhone = $("#phone_mobile");
    private static SelenideElement aliasAddress = $("#alias");
    private static SelenideElement register = $("#submitAccount");


    public static void createAccount(String name,
                                     String lsName,
                                     String pass,
                                     String companyName,
                                     String address,
                                     String town,
                                     String passCod,
                                     String info,
                                     String phoneHome,
                                     String phoneMobile,
                                     String alias) {
        genderWoman.click();
        firstname.setValue(name);
        lastname.setValue(lsName);
        passwd.setValue(pass);
        days.click();
        dropdownDays.click();
        months.click();
        dropdownMonths.click();
        years.click();
        dropdownYears.click();
        newsLetter.click();
        offersCheckbox.click();
        company.setValue(companyName);
        address1.setValue(address);
        city.setValue(town);
        state.click();
        dropdownState.click();
        postcode.setValue(passCod);
        country.click();
        dropdownCountry.click();
        otherInfo.setValue(info);
        phone.setValue(phoneHome);
        mobilePhone.setValue(phoneMobile);
        aliasAddress.setValue(alias);
        register.click();
    }
}

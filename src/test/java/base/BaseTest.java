package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.selenide.LogType;
import model.TestConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.TestConfigSettings;


import java.util.Map;
import java.util.logging.Level;

abstract public class BaseTest {

    public final static String EMAIL = "pkotot@mailto.plus";
    public final static String PASSWD = "12345";

    private static final String ALLURE = "Allure";
    public static final TestConfig CONFIG = TestConfigSettings.getInstance().getTestConfig();

    public static void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        WebDriverManager.chromedriver().setup();
        if (CONFIG.isRemoteType()) {
            Configuration.remote = CONFIG.getRemoteUrl();
        }
        Configuration.browser = CONFIG.getBrowser();
        Configuration.browserVersion = CONFIG.getBrowserVersion();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", false
        ));
        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = CONFIG.getBrowserSize();
        Configuration.headless = CONFIG.getHeadless();
        Configuration.baseUrl = CONFIG.getBaseUrl();
        Configuration.timeout = CONFIG.getTimeout();
        Configuration.fastSetValue = CONFIG.getFastSetValue();
        Configuration.savePageSource = CONFIG.getSavePageSource();

    }

    public void begin() {
        SelenideLogger.addListener(ALLURE, new AllureSelenide()
                .savePageSource(CONFIG.getSavePageSource())
                .screenshots(CONFIG.getScreenshots())
                .enableLogs(LogType.BROWSER, Level.SEVERE)
                .enableLogs(LogType.CLIENT, Level.SEVERE)
                .enableLogs(LogType.SERVER, Level.SEVERE)
                .enableLogs(LogType.PERFORMANCE, Level.SEVERE));
    }

    @BeforeAll
    public static void init() {
        setUp();
    }

    @BeforeEach
    public void openWebSite() {
        Selenide.open("/");
        begin();
    }

    @AfterEach
    @Step("Close window")
    public void tearDown() {
        SelenideLogger.removeListener(ALLURE);
        Selenide.closeWindow();
    }
}








package basket;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import model.TestConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.TestConfigSettings;

import java.net.MalformedURLException;
import java.util.Map;

abstract public class BaseTest2 {
//    private static final String ALLURE = "Allure";
//    public static final TestConfig CONFIG = TestConfigSettings.getInstance().getTestConfig();
//    public final static String EMAIL = "pkotot@mailto.plus";
//    public final static String PASSWD = "12345";
//    public final static String ORDER = "ORDER CONFIRMATION";
//    public final static String SENT_TEXT = "Your message has been successfully sent to our team.";
//    public final static String COMMENT_TEXT = "New comment\n" +
//            "Your comment has been added and will be available once approved by a moderator\n" +
//            "\n" +
//            "OK";
//    public final static String SEND_COMMIT_TEXT = "Faded short sleeve t-shirt with high neckline. " +
//            "Soft and stretchy material for a comfortable fit. " +
//            "Accessorize with a straw hat and you're ready for summer!";
//    public final static String TITLE_COMMIT_TEXT = "High quality product";
//    public final static String URL_COLOR = "color-yellow";
//    public final static String MESSAGE_TEXT = "I have a problem with my order. Could you help me?";
    public static final TestConfig CONFIG = TestConfigSettings.getInstance().getTestConfig();

    public static void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        WebDriverManager.chromedriver().setup();
        if (CONFIG.isRemoteType()){
        Configuration.remote = CONFIG.getRemoteUrl();
        }
        Configuration.browser = CONFIG.getBrowser();
        Configuration.browserVersion = CONFIG.getBrowserVersion();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
        Configuration.browserSize = CONFIG.getBrowserSize();
        Configuration.headless = CONFIG.getHeadless();
        Configuration.baseUrl = CONFIG.getBaseUrl();
        Configuration.timeout = CONFIG.getTimeout();
        Configuration.fastSetValue = CONFIG.getFastSetValue();
        Configuration.savePageSource = CONFIG.getSavePageSource();


    }
    @BeforeAll
    public static void init() throws MalformedURLException {
        setUp();
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("browserVersion", "101.0");
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//        RemoteWebDriver driver = new RemoteWebDriver(
//                URI.create("http://selenoid:4444/wd/hub").toURL(),
//                capabilities
//        );
    }

    @AfterAll
    public static void tearDown(){
        Selenide.closeWebDriver();
    }
    @BeforeEach
    public void openWebSite(){
        Selenide.open("/");
    }

    @AfterEach
    public void closeWindow(){
        Selenide.closeWindow();
    }

//    @BeforeEach
//    public void begin() {
//        SelenideLogger.addListener(ALLURE, new AllureSelenide()
//                .savePageSource(CONFIG.getSelenideSavePageSource())
//                .screenshots(CONFIG.getSelenideScreenshots())
//                .enableLogs(LogType.BROWSER, Level.SEVERE)
//                .enableLogs(LogType.CLIENT, Level.SEVERE)
//                .enableLogs(LogType.SERVER, Level.SEVERE)
//                .enableLogs(LogType.PERFORMANCE, Level.SEVERE));
//    }
//
//    @AfterEach
//    @Step("Close window")
//    public void tearDown() {
//        Selenide.closeWindow();
//        SelenideLogger.removeListener(ALLURE);
//    }


}

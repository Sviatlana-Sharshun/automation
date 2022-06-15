package basket;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Browsers.FIREFOX;

public class MainPageTest3 {

    @Test
    public void openPage() {
        Configuration.browser = FIREFOX;
        open("http://automationpractice.com/index.php");
    }
}

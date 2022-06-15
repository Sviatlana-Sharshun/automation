package basket;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class MainPageTest {
    @Test
    public void openPage() {
        Selenide.open("http://automationpractice.com/index.php");
    }
}

package basket;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest5 {
    @Test
    public void openPage() {
        open("http://automationpractice.com/index.php");
        String expectedTitle = "My Store";
        String actualTitle = Selenide.title();
        if (expectedTitle.contentEquals(actualTitle)) {
            System.out.println("Тест пройден");
        } else {
            System.out.println("Тест не пройден");
        }
    }
}

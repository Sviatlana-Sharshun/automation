package service.ui;

import com.codeborne.selenide.SelenideElement;
import enums.Feature;
import org.openqa.selenium.By;
import service.ui.UiTestExecutor.UiExecutorType;


public class ScreenshotService {

  private static final UiTestExecutor UI_TEST_EXECUTOR = UiTestExecutorFactory.getInstance().get(UiExecutorType.COMPARE);


  private ScreenshotService() {
  }

  public static void uiExecutor(
      final Feature feature,
      final By... ignoredElements
  ) {
    UI_TEST_EXECUTOR.execute(feature, ignoredElements);
  }

  public static void uiExecutor(
          SelenideElement element,
          final Feature feature,
          final By... ignoredElements
  ) {
    UI_TEST_EXECUTOR.execute(feature, ignoredElements);
  }

}

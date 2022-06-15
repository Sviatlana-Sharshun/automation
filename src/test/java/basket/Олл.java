package basket;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Олл {
    @Test
    public void qase2 (){
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email_create").sendKeys("hffhj@gmail.com");
        $("#SubmitCreate").click();
        $("#id_gender2").click();
        $("#customer_firstname").sendKeys("Test");
        $("#customer_lastname").sendKeys("Test");
        $("#passwd").sendKeys("12345");
        $("#days").click();
        $("#days > option:nth-child(2)").click();
        $("#months").click();
        $("#months > option:nth-child(2)").click();
        $("#years").click();
        $("#years > option:nth-child(4)").click();
        $("#newsletter").click();
        $("#optin").click();
        $("#company").sendKeys("Kaseya");
        $("#address1").sendKeys("701 Brickell Avenue");
        $("#address2").sendKeys("2");
        $("#city").sendKeys("Miami");
        $("#id_state").click();
        $("#id_state > option:nth-child(11)").click();
        $("#postcode").sendKeys("33131");
        $("#id_country").click();
        $("#id_country > option:nth-child(2)").click();
        $("#other").sendKeys("Additional information");
        $("#phone").sendKeys("+375292929297");
        $("#phone_mobile").sendKeys("+375333333333");
        $("#alias").clear();
        $("#alias").sendKeys("18, Baker street");
        $("#submitAccount").click();
//        $("#block_top_menu > ul > li:nth-child(2) > a").click();
//        $("#categories_block_left > div > ul > li:nth-child(1)").click();
//        $("a.product_img_link > img").hover();
//        $(".ajax_add_to_cart_button.btn.btn-default").click();
//        $(".btn-default.button.button-medium").click();
//        $(".standard-checkout.button-medium").click();
//        $("p > button").click();
//        $("#cgv").click();
//        $(".standard-checkout.button-medium").click();
//        $(".bankwire").click();
//        $("#cart_navigation > button").click();
//        String cod = $(By.xpath("//*[@id='center_column']/div/text()[6]")).getText();
//        System.out.println(cod);
//        cod = cod.replace("- Do not forget to insert your order reference ", "");
//        System.out.println(cod);
//        cod = cod.replace(" in the subject of your bank wire.\n" +
//                "\t\t\t\t", "");
//        System.out.println(cod);
    }
    @Test
    public void orderCasualDress() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $("#categories_block_left li:nth-child(1)").click();
        $("a.product_img_link > img").hover();
        $(".ajax_add_to_cart_button").click();
        $("a.button-medium").click();
        $(".standard-checkout.button-medium").click();
        $("p > button").click();
        $("#cgv").click();
        $(".standard-checkout.button-medium").click();
        $(".bankwire").click();
        $("#cart_navigation > button").click();
        assertEquals("ORDER CONFIRMATION", $(".page-heading").getText());
        $(".logout").click();
    }

    @Test
    public void sendEmailCustomerService	() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email_create").sendKeys(RandomStringUtils.randomAlphabetic(5) + "@gmail.com");
        $("#SubmitCreate").click();
        $("#id_gender2").click();
        $("#customer_firstname").sendKeys("Test");
        $("#customer_lastname").sendKeys("Test");
        $("#passwd").sendKeys("12345");
        $("#days").click();
        $("#days > option:nth-child(2)").click();
        $("#months").click();
        $("#months > option:nth-child(2)").click();
        $("#years").click();
        $("#years > option:nth-child(4)").click();
        $("#newsletter").click();
        $("#optin").click();
        $("#company").sendKeys("Kaseya");
        $("#address1").sendKeys("701 Brickell Avenue");
        $("#address2").sendKeys("2");
        $("#city").sendKeys("Miami");
        $("#id_state").click();
        $("#id_state > option:nth-child(11)").click();
        $("#postcode").sendKeys("33131");
        $("#id_country").click();
        $("#id_country > option:nth-child(2)").click();
        $("#other").sendKeys("Additional information");
        $("#phone").sendKeys("+375292929297");
        $("#phone_mobile").sendKeys("+375333333333");
        $("#alias").clear();
        $("#alias").sendKeys("18, Baker street");
        $("#submitAccount").click();
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $("#categories_block_left li:nth-child(1)").click();
        $("a.product_img_link > img").hover();
        $(".ajax_add_to_cart_button.btn.btn-default").click();
        $(".btn-default.button.button-medium").click();
        $(".standard-checkout.button-medium").click();
        $("p > button").click();
        $("#cgv").click();
        $(".standard-checkout.button-medium").click();
        $(".bankwire").click();
        $("#cart_navigation > button").click();
        String order = $(".box").getText();
        order = StringUtils.substringBefore(order, " in the");
        order = StringUtils.substringAfter(order, "reference ");
        $(".button-exclusive.btn.btn-default").click();
        $(By.linkText(order)).click();
        String product = $("td.bold > label").getText();
        $("#contact-link").click();
        $("#id_contact").click();
        $("#id_contact > option:nth-child(2)").click();
        $("div:nth-child(6) > div > select").click();
        $(withText(order)).shouldBe(Condition.visible).click();
        $("select[style$='inline-block;']").click();
        $(withText(product)).shouldBe(Condition.visible).click();
        $("#message").sendKeys("I have a problem with my order. Could you help me?");
        $("#submitMessage").click();
        assertEquals("Your message has been successfully sent to our team.", $(".alert-success")
                .getText());
        $(".logout").click();
    }

    @Test
    public void writeReview() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("#block_top_menu > ul > li:nth-child(3)").click();
        $("[itemprop='name']").hover();
        $(".lnk_view.btn").click();
        $("li a.open-comment-form").click();
        $("a[title = '5']").click();
        $("#comment_title").sendKeys("High quality product");
        $("#content")
                .sendKeys("Faded short sleeve t-shirt with high neckline. " +
                        "Soft and stretchy material for a comfortable fit. " +
                        "Accessorize with a straw hat and you're ready for summer!");
        $("#submitNewMessage").click();
        $("#new_comment_form").should(Condition.disappear);
        assertEquals("New comment\n" +
                        "Your comment has been added and will be available once approved by a moderator\n" +
                        "\n" +
                        "OK",
                $(".fancybox-inner").getText());
        $("button.button-medium").click();
        $(".logout").click();
    }

    @Test
    public void addWishlist() {
        Selenide.open("http://automationpractice.com/index.php");
        $(".login").click();
        $("#email").sendKeys("pkotot@mailto.plus");
        $("#passwd").sendKeys("12345");
        $("#SubmitLogin").click();
        $("[title = 'Women']").click();
        $("#categories_block_left > div > ul > li:nth-child(1)").click();
        $(".product-name[title='Blouse']").hover();
        $(".last-item-of-tablet-line .lnk_view").click();
        $("#wishlist_button").click();
        $(".fancybox-close").click();
        $(".account").click();
        $(".lnk_wishlist").click();
        $(".icon-remove").click();
        Selenide.switchTo().alert().accept();
        $(".table-bordered").should(Condition.disappear);
        Assertions.assertFalse($(".table-bordered").isDisplayed());
        $(".logout").click();
    }

    @Test
    public void displayForDifferentDressColor() {
        Selenide.open("http://automationpractice.com/index.php");
        $("#block_top_menu > ul > li:nth-child(2) > a").click();
        $("#categories_block_left > div > ul > li.last > a").click();
        $("li:nth-child(1) .right-block").hover();
        $("li:nth-child(1) .lnk_view.btn-default > span").click();
        $("#color_11").click();
        $("#color_13").click();
        $("#color_14").click();
        $("#color_16").click();
        WebDriverRunner driverRunner = new WebDriverRunner();
        String url = driverRunner.url();
        assertEquals(
                "http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-yellow",
                url);
    }

//    <?xml version="1.0" encoding="UTF-8"?>
//<project xmlns="http://maven.apache.org/POM/4.0.0"
//    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//  <modelVersion>4.0.0</modelVersion>
//
//  <groupId>org.example</groupId>
//  <artifactId>automationpractice</artifactId>
//  <version>1.0-SNAPSHOT</version>
//
//  <properties>
//    <maven.compiler.source>11</maven.compiler.source>
//    <maven.compiler.target>11</maven.compiler.target>
//    <skipStaticAnalyse>false</skipStaticAnalyse>
//    <checkstyle.maven.plugin.version>2.17</checkstyle.maven.plugin.version>
//    <checkstyle.version>9.2.1</checkstyle.version>
//    <pmd.maven.plugin.version>3.14.0</pmd.maven.plugin.version>
//    <maven-surefire-plugin.version>3.0.0-M5</maven-surefire-plugin.version>
//    <aspectj.version>1.9.7</aspectj.version>
//    <checkstyle.maven.plugin.version>3.1.2</checkstyle.maven.plugin.version>
//    <maven-compiler-plugin.version>3.8.1</maven-compiler-plugin.version>
//  </properties>
//
//  <dependencies>
//    <dependency>
//      <groupId>com.codeborne</groupId>
//      <artifactId>selenide</artifactId>
//      <version>6.1.1</version>
//      <scope>test</scope>
//    </dependency>
//    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-params -->
//    <dependency>
//      <groupId>org.junit.jupiter</groupId>
//      <artifactId>junit-jupiter-params</artifactId>
//      <version>5.8.2</version>
//    </dependency>
//    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
//    <dependency>
//      <groupId>org.testng</groupId>
//      <artifactId>testng</artifactId>
//      <version>7.4.0</version>
//    </dependency>
//    <dependency>
//      <groupId>com.codeborne</groupId>
//      <artifactId>selenide-core</artifactId>
//      <version>6.1.1</version>
//      <scope>compile</scope>
//    </dependency>
//    <dependency>
//      <groupId>com.codeborne</groupId>
//      <artifactId>selenide</artifactId>
//      <version>6.1.1</version>
//      <scope>compile</scope>
//    </dependency>
//  </dependencies>
//  <build>
//    <plugins>
//      <plugin>
//        <groupId>org.apache.maven.plugins</groupId>
//        <artifactId>maven-checkstyle-plugin</artifactId>
//    <version>${checkstyle.maven.plugin.version}</version>
//        <dependencies>
//          <dependency>
//            <groupId>com.puppycrawl.tools</groupId>
//            <artifactId>checkstyle</artifactId>
//    <version>${checkstyle.version}</version>
//          </dependency>
//        </dependencies>
//        <configuration>
//    <skip>${skipStaticAnalyse}</skip>
//        </configuration>
//        <executions>
//          <execution>
//            <id>validate</id>
//            <phase>validate</phase>
//            <configuration>
//    <configLocation>${basedir}/checkstyle.xml</configLocation>
//    <suppressionsLocation>${basedir}/checkstyle-suppressions.xml
//            </suppressionsLocation>
//              <suppressionsFileExpression>checkstyle.suppressions.file</suppressionsFileExpression>
//              <encoding>UTF-8</encoding>
//              <consoleOutput>true</consoleOutput>
//              <failsOnError>true</failsOnError>
//              <violationSeverity>warning</violationSeverity>
//              <failOnViolation>true</failOnViolation>
//              <sourceDirectories>
//    <sourceDirectory>${project.build.sourceDirectory}</sourceDirectory>
//              </sourceDirectories>
//              <includeTestSourceDirectory>true</includeTestSourceDirectory>
//            </configuration>
//            <goals>
//              <goal>check</goal>
//            </goals>
//          </execution>
//        </executions>
//      </plugin>
//      <plugin>
//        <groupId>org.apache.maven.plugins</groupId>
//        <artifactId>maven-pmd-plugin</artifactId>
//    <version>${pmd.maven.plugin.version}</version>
//        <configuration>
//    <skip>${skipStaticAnalyse}</skip>
//          <linkXRef>false</linkXRef>
//          <sourceEncoding>UTF-8</sourceEncoding>
//          <verbose>true</verbose>
//          <failurePriority>5</failurePriority>
//          <failOnViolation>true</failOnViolation>
//          <includeTests>true</includeTests>
//          <rulesets>
//            <ruleset>pmd-ruleset.xml</ruleset>
//          </rulesets>
//          <excludeRoots>
//            <excludeRoot>target/generated-sources</excludeRoot>
//          </excludeRoots>
//        </configuration>
//        <executions>
//          <execution>
//            <phase>validate</phase>
//            <goals>
//              <goal>check</goal>
//            </goals>
//          </execution>
//        </executions>
//      </plugin>
//      <plugin>
//        <groupId>org.apache.maven.plugins</groupId>
//        <artifactId>maven-surefire-plugin</artifactId>
//    <version>${maven-surefire-plugin.version}</version>
//        <configuration>
//          <argLine>
//            -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
//          </argLine>
//          <systemPropertyVariables>
//            <allure.results.directory>${project.build.directory}/allure-results</allure.results.directory>
//          </systemPropertyVariables>
//        </configuration>
//        <dependencies>
//          <dependency>
//            <groupId>org.aspectj</groupId>
//            <artifactId>aspectjweaver</artifactId>
//    <version>${aspectj.version}</version>
//          </dependency>
//        </dependencies>
//      </plugin>
//                  <plugin>
//                      <groupId>io.qameta.allure</groupId>
//                      <artifactId>allure-maven</artifactId>
//                      <version>2.10.0</version>
//                  </plugin>
//      <plugin>
//        <groupId>org.apache.maven.plugins</groupId>
//        <artifactId>maven-checkstyle-plugin</artifactId>
//    <version>${checkstyle.maven.plugin.version}</version>
//        <dependencies>
//          <dependency>
//            <groupId>com.puppycrawl.tools</groupId>
//            <artifactId>checkstyle</artifactId>
//    <version>${checkstyle.version}</version>
//          </dependency>
//        </dependencies>
//        <configuration>
//    <skip>${skipStaticAnalyse}</skip>
//        </configuration>
//        <executions>
//          <execution>
//            <id>validate</id>
//            <phase>validate</phase>
//            <configuration>
//    <configLocation>${basedir}/checkstyle.xml</configLocation>
//    <suppressionsLocation>${basedir}/checkstyle-suppressions.xml</suppressionsLocation>
//              <suppressionsFileExpression>checkstyle.suppressions.file</suppressionsFileExpression>
//              <encoding>UTF-8</encoding>
//              <consoleOutput>true</consoleOutput>
//              <failsOnError>true</failsOnError>
//              <violationSeverity>warning</violationSeverity>
//              <failOnViolation>true</failOnViolation>
//              <sourceDirectories>
//    <sourceDirectory>${project.build.sourceDirectory}</sourceDirectory>
//              </sourceDirectories>
//              <includeTestSourceDirectory>true</includeTestSourceDirectory>
//            </configuration>
//            <goals>
//              <goal>check</goal>
//            </goals>
//          </execution>
//        </executions>
//      </plugin>
//      <plugin>
//        <groupId>org.apache.maven.plugins</groupId>
//        <artifactId>maven-compiler-plugin</artifactId>
//    <version>${maven-compiler-plugin.version}</version>
//        <configuration>
//          <release>11</release>
//          <source>11</source>
//          <target>11</target>
//        </configuration>
//      </plugin>
//    </plugins>
//  </build>
//
//</project>
    }


package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
         Configuration.pageLoadStrategy = "eager";
        open("https://www.hltv.org/");
    }
}

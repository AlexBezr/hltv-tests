package tests;

import com.github.javafaker.Faker;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static pages.MainPage.MidBar;
import static pages.MainPage.TopBar;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    Faker faker = new Faker();

    String login = faker.name().firstName();
    String password = faker.name().lastName();

   @Test
   @DisplayName("Проверка вверхней панели")
    void CheckElementsOnTopBar() {
       MainPage.CheckTopBar("Matches");
       MainPage.CheckTopBar("Results");
       MainPage.CheckTopBar("Events");
       MainPage.CheckTopBar("Players");
       MainPage.CheckTopBar("Stats");
       MainPage.CheckTopBar("Fantasy");
       MainPage.CheckTopBar("Forum");
       MainPage.CheckTopBar("Media");
       MainPage.CheckTopBar("Betting");
       MainPage.CheckTopBar("Live");
    }

    @Test
    @DisplayName("Проверка основных элементов страницы")
    void CheckMidElements() {
        MainPage.CheckMidBar("Overview");
        MainPage.CheckMidBar("Matches");
        MainPage.CheckMidBar("Results");
        MainPage.CheckMidBar("Stats");
        MainPage.CheckMidBar("Yesterday's news");
        MainPage.CheckMidBar("Today's news");
    }

    @Test
    @Step("Проверка кликабельности Matches")
    void CheckResultsPage() {
        TopBar.find(byText("Matches")).click();
       $(".new-standardPageGrid").shouldHave(text("Upcoming Counter-Strike matches"));
    }

    @Test
    @Step("Проверка кликабельности Stats")
    void CheckStatsButton() {
        TopBar.find(byText("Stats")).click();
        $(".widthControl").shouldHave(text("Quick navigation"));
    }

    @Test
    @Step("Проверка кликабельности Results")
    void CheckResultsButton() {
        TopBar.find(byText("Results")).click();
        $(".widthControl").shouldHave(text("Featured results"));
    }

    @Test
    @DisplayName("Ошибочная авторизация пользователя")
    void SignUp() {
      $(".navsignin").click();
      $(".login-dialog standard-box").$("[name=username]").setValue(login);
      $(".login-dialog standard-box").$("[name=password]").setValue(password);
      $("type=submit").find(byText("Login")).click();
    }
}
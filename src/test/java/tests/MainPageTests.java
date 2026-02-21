package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

   @Test
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
    void CheckMidElements() {
      $(".colCon").shouldHave(text("Overview"));
        $(".colCon").shouldHave(text("Matches"));
        $(".colCon").shouldHave(text("Results"));
        $(".colCon").shouldHave(text("Stats"));
        $(".colCon").shouldHave(text("Yesterday's news"));
        $(".colCon").shouldHave(text("Today's news"));

    }

    @Test
    void SignUp() {
      $(".navsignin").click();
      $(".login-dialog standard-box").$("[name=username]").setValue("admin");
      $(".login-dialog standard-box").$("[name=password]").setValue("admin");
      $("type=submit").find(byText("Login")).click();
    }
}
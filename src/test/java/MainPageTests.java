import com.codeborne.selenide.Configuration;
import net.bytebuddy.build.Plugin;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTests {

  @BeforeAll
  static void beforeAll() {
      Configuration.browser = "chrome";
      Configuration.browserSize = "1920x1080";
      Configuration.pageLoadStrategy = "eager";
      open("https://www.hltv.org/");
  }

   @Test
    void CheckElementsOnTopBar() {
       $("#navBarContainerFull").shouldHave(text("News"));
       $("#navBarContainerFull").shouldHave(text("Matches"));
       $("#navBarContainerFull").shouldHave(text("Results"));
       $("#navBarContainerFull").shouldHave(text("Events"));
       $("#navBarContainerFull").shouldHave(text("Players"));
       $("#navBarContainerFull").shouldHave(text("Stats"));
       $("#navBarContainerFull").shouldHave(text("Fantasy"));
       $("#navBarContainerFull").shouldHave(text("Forum"));
       $("#navBarContainerFull").shouldHave(text("Media"));
       $("#navBarContainerFull").shouldHave(text("Betting"));
       $("#navBarContainerFull").shouldHave(text("Live"));
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
      $(".navsearchinput tt-input").setValue("ZyWoo");
    }
}
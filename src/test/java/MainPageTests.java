import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageTests {
   @Test
    void just() {
        open("https://www.hltv.org/");
        $(".nav-link ").shouldHave(text("News"));
    }
}
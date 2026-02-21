package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static SelenideElement TopBar = $("#navBarContainerFull");

    public static void CheckTopBar(String value) {
        TopBar.shouldHave(text(value));
    }
}

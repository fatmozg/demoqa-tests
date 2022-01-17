package it.twt;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "2048x1024";
    }
    @Test
    void fillFormTest() {
        String name = "Ilia";
        String email = "ilia@twt.it";
        String cAdress = "corso Monte San Gabriele";
        String pAdress = "via Matteo Maria Boiardo";

        open("https://demoqa.com/text-box");
        $("#userName").setValue(name);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(cAdress);
        $("#permanentAddress").setValue(pAdress);
        $("#submit").click();
        $("#output #name").shouldHave(text(name));
        $("#output #email").shouldHave(text(email));
        $("#output #currentAddress").shouldHave(text(cAdress));
        $("#output #permanentAddress").shouldHave(text(pAdress));
    }
}

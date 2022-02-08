package it.twt.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    @BeforeAll
    public static void beforeAll() {
        baseUrl = "https://demoqa.com";
        Configuration.browserSize = "2700x1700";
        open(baseUrl + "/automation-practice-form");
    }
}

package it.twt.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    public static void beforeAll() {
        Configuration.browserSize = "2700x1700";
        Configuration.baseUrl = "https://demoqa.com";
    }
}

package it.twt.tests;

import it.twt.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static it.twt.tests.TestData.*;


public class RegistrationFormWithPageObjectTests extends TestBase{

RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void fillFormTests() {
        open("https://demoqa.com");
        registrationPage.openPage();
        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeEmail(email);
        $("#genterWrapper").$(byText(gender)).click();
        registrationPage.typeNumber(number);
        registrationPage.calendar.setDate(day, month, year);
        $("#subjectsContainer").setValue(subject);
        $("#col-md-9 col-sm-12").$(byText(hobbies)).click();
        $("#col-md-9 col-sm-12").$(byText(hobbies)).click();
        $("#uploadPicture").uploadFromClasspath(fileName);
        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#submit").click();
    }
}

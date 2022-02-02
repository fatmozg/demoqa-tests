package it.twt.tests;

import it.twt.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static it.twt.tests.TestData.*;


public class RegistrationFormWithPageObjectTests extends TestBase {
RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTests() {
        registrationPage.openPage();
        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.typeEmail(email);
        /*registrationPage.selectGender(gender);*/
        registrationPage.typeNumber(number);
        registrationPage.calendar.setDate(day,month,year);
        $("#subjectsContainer").setValue(subject);
        $("#col-md-9 col-sm-12").$(byText(hobbies1)).click();
        $("#col-md-9 col-sm-12").$(byText(hobbies2)).click();
        $("#uploadPicture").uploadFromClasspath(fileName);
        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#submit").click();
    }
}

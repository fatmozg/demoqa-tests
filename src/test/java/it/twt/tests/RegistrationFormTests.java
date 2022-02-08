package it.twt.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static it.twt.tests.TestData.*;


public class RegistrationFormTests extends TestBase {

    @Test
    void fillFormTests() {
        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").setValue(number);
        $("#dateOfBirthInput").click();
        $("#react-datepicker__month-select").selectOption(month);
        $("#react-datepicker__year-select").selectOption(year);
        $("#react-datepicker__day react-datepicker__day--019 react-datepicker__day--weekend").click();
        $("#subjectsContainer").setValue(subject);
        $("#col-md-9 col-sm-12").$(byText(hobbies)).click();
        $("#col-md-9 col-sm-12").$(byText(hobbies)).click();

        $("#currentAddress").setValue(currentAddress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#submit").click();
    }
}

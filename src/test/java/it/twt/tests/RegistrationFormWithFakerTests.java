package it.twt.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static it.twt.tests.TestData.*;


public class RegistrationFormWithFakerTests extends TestBase {


    @Test
    void fillFormTests() {
        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#currentAddress").setValue(currentAddress);
        sleep(10000);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").setValue(number);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__month-container").$(byText(day)).click();
        $("#subjectsInput").setValue(subject);
        $("#hobbiesWrapper").$(byText(hobbies)).click();
        $("#hobbiesWrapper").$(byText(hobbies)).click();
        //$("#uploadPicture").uploadFromClasspath(fileName);
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();
        $("#submit").click();
    }
}

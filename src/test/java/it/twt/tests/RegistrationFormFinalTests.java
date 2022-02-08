package it.twt.tests;

import it.twt.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static it.twt.tests.TestData.*;

public class RegistrationFormFinalTests extends TestBase {
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fillFormTests() {
        registrationPage.openPage();
        registrationPage.typeFirstName(firstName);
        registrationPage.typeLastName(lastName);
        registrationPage.selectGender();
        registrationPage.typeNumber(String.valueOf(phoneNumber));
        registrationPage.calendar.setDate(day,month, year);
        registrationPage.typeSubject(subject);
        registrationPage.selectHobby();

    }
}

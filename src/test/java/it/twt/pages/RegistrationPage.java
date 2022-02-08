package it.twt.pages;

import com.codeborne.selenide.SelenideElement;
import it.twt.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static it.twt.tests.TestData.*;

public class RegistrationPage {

    private SelenideElement formTitle = $("#practice-form-wrapper"),
            firstNameInput = $("#firstName").setValue(firstName),
            lastNameInput = $("#lastName").setValue(lastName),
            genderSelect = $("#genterWrapper").$(byText(gender)),
            emailInput = $("#userEmail").setValue(email),
            numberInput = $("#userNumber").setValue(number),
            subjectInput = $("#subjectsContainer").setValue(subject),
            hobbiesSelect = $("#col-md-9 col-sm-12").$(byText(hobbies));

    public CalendarComponent calendar = new CalendarComponent();
    private final String FORM_TITLE = "Student Registration Form";

    public void openPage() {
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public void typeFirstName(String value) {
        firstNameInput.setValue(firstName);
    }

    public void typeLastName(String value) {
        lastNameInput.setValue(lastName);
    }

    public void typeEmail(String value) {
        emailInput.setValue(email);
    }

    public void typeNumber(String value) {
        numberInput.setValue(number);
    }

    public void selectGender() {
        genderSelect.click();
    }

    public void selectHobby() {
        hobbiesSelect.click();
    }

    public void typeSubject (String value) {
        subjectInput.setValue(subject);
    }
}

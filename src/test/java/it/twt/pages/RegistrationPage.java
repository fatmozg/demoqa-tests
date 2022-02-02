package it.twt.pages;

import com.codeborne.selenide.SelenideElement;
import it.twt.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static it.twt.tests.TestData.*;

public class RegistrationPage {

    private SelenideElement formTitle = $("#practice-form-wrapper"),
            firstNameInput = $("#firstName").setValue(firstName),
            lastNameInput = $("#lastName").setValue(lastName),
            emailInput = $("#userEmail").setValue(email),
            numberInput = $("#userNumber").setValue(number);

    public CalendarComponent calendar = new CalendarComponent();
    private String FORM_TITLE = "Student Registration Form";


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
}

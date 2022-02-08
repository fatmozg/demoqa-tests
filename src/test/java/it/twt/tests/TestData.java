package it.twt.tests;

import com.github.javafaker.Faker;

public abstract class TestData {
    static Faker faker = new Faker();
    public static String
            url = "/automation-practice-form",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            currentAddress = faker.address().fullAddress(),

            gender = "Male",
            number = String.valueOf(faker.phoneNumber()),
            month = "June",
            year = "1994",
            day = "19",

            subject = faker.expression(String.valueOf(10)),

            hobbies = "Sports",
            fileName = "/Users/macbook/Desktop/Screenshot 2022-02-03 at 10.43.16.png",
            state = "NCR",
            city = "Delhi";

    public static int phoneNumber = Integer.parseInt(number);

}

package it.twt.pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        //String.format
        String selector = ".react-datepicker__day react-datepicker__day--%s react-datepicker__day--weekend react-datepicker__day--outside-month";
        String formatedSelector = String.format(selector,day);
        $("formatedSelector").click();

    }
}

package it.twt.docs;

import static it.twt.utils.RandomUtils.getRandomEmail;
import static it.twt.utils.RandomUtils.getRandomString;

public class RandomExamples {
    public static void main(String[] args) {
        System.out.println(getRandomString(44));
        System.out.println(getRandomEmail());
    }
}

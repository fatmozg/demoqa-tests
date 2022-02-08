package it.twt.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    // capitalize
    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // INT
    public static int getRandomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt((max - min) + 1) + min;
    }

    // LONG
    public static long getRandomLong(long min, long max) {
        Random rnd = new Random();
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    // STRING
    public static String getRandomString(int length) {
        String simbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * simbols.length());
            result.append(simbols.charAt(index));
        }
        return result.toString();
    }

    // STRING MESSAGE
   /* public static String getRandomMessage(int min, int max) {
        String[] words = {"and", "or", "but", "because", "red", "white", "black", "man", "women", "where", "there", "here",
                "fish", "elephant", "crocodile", "africa", "savanna", "jumps", "talk", "talks", "answer", "morning", "good", "in",
                "who", "why", "not", "yes", "sure", ". ", ", ", "(", ")", " ", "sees", "knows", "its", "answers", "questions", "makes"};

        StringBuilder message = new StringBuilder();
        int messageLength = getRandomInt(min, max);
        while (message.length() < messageLength) {
            int wordIndex = getRandomInt(0, words.length - 1);
            message.append(words[wordIndex] + " ");
        }
        String readyMessage = StringUtils.capitalize(message.toString())
                .replace("  ", " ")
                .replace(" ,", ",")
                .replace(" .", ".").trim();
        return readyMessage;
    }*/

    // PHONE
    public static String getRandomPhone() {
        return getRandomLong(1111111111111111L, 9999999999999999L) + "";
    }

    // PHONE WITH CODE
    public static String getRandomPhoneWithCode(String code) {
        return code + getRandomLong(1111111111111111L, 9999999999999999L);
    }

    // EMAIL
    public static String getRandomEmail() {
        String domain = "@twt.it";
        return getRandomString(10) + domain;
    }
}

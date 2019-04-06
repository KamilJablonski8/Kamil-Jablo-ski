package com.regex.tasks;

public class RegexUtil {
    public static boolean isValidPostalCode(String text) {

        String reg = "\\d{2}-\\d{3}";
        return text.matches(reg);
    }

    public static boolean isValidHttpAddress(String text) {

        String reg = "^(http|https):\\/\\/[^ \"]+$";
        return text.matches(reg);
    }

    public static boolean isVaildDateFormat(String text) {

        String reg = "^\\s*(3[01]|[12][0-9]|0?[1-9])\\.(1[012]|0?[1-9])\\.((?:19|20)\\d{2})\\s*$";
        return text.matches(reg);
    }
}

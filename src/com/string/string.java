package com.string;


public class string {
    public static void main(String[] args) {
    String text = "Dziś sobota";

    String msg = createText(text);

    }

    static String createText(String text)
    {

        StringBuilder s12 = new StringBuilder("Saymon says: ");
        s12.append(text);
        return s12.toString();



    }
}




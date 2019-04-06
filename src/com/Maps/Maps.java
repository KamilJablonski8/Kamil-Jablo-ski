package com.Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    static Map<String, String> vocabulary = new HashMap<>();

    public static void main(String[] args) {
        //dodaj
        vocabulary.put("kot", "cat");

        //sprawdż
        System.out.println("contains cat: " + vocabulary.containsValue("kot"));

        //pobierz pojedyńczy element
        String catInEnglish = vocabulary.get("kot");
        System.out.println("catInEnglish = " + catInEnglish);

        //usuń
    }
}

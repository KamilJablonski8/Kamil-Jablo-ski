package com.family;

import com.family.Family;

public class FamilyTest {
    public static void main(String[] args) {
        Person husband1 = new Person("Ryszard", "Ochócki", 44, "5874585555555");


        // System.out.println("husband1="+husband1);
        Person wife1 = new Person("Ewa", "Ochócka", 24, "14588858445");
        Person child1 = new Person("Tomek","Ochócki",10, "98568548584");

        Family family1 = new Family(husband1, wife1, child1, "Rodzina z Misia");
        System.out.println(family1);
    }
}

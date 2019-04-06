package com.family;

public class Person<large> {

String name;
String surName;
int age;
String pesel;

    public Person(String name, String surName, int age, String pesel) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() { return pesel; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}

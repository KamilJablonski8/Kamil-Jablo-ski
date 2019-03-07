package com.family;

public class Family {
    private Person husband;
    private Person wife;
    private Person child;
    private String name;



    public Family(Person husband, Person wife, Person child, String name) {
        this.husband = husband;
        this.wife = wife;
        this.child = child;
        this.name = name;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    public Person getChild() {
        return child;
    }

    public String getName() {
        return name;
    }
//slash n tworzy kom od nowego wiersza
    @Override
    public String toString() {
        return "com.family.Family{" +
                "\nhusband=" + husband +
                "\n, wife=" + wife +
                "\n, child=" + child +
                "\n, name='" + name + '\'' +
                '}';
    }
}

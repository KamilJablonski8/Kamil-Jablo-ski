package com.InterfacesAnimal;

public class Mannam implements Animal {
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public String speak() {
        return "Hau";
    }
}

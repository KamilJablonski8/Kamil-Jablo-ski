package com.InterfacesAnimal;

public class AnimalTest {
    public static void main(String[] args) {
        Birds bird = new Birds();
        Mannam mannam = new Mannam();

        Animal[] animals = {bird, mannam};
        for (Animal animal: animals) {
            System.out.println(animal.getName()+" says " + animal.speak());
        }
    }
}



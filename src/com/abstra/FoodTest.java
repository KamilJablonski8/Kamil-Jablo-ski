package com.abstra;

public abstract class FoodTest {
    public static void main(String[] args) {
        Food chicken = new Chicken();
        Food ham = new Ham();
        Food carrot = new Carrot();
        Food salad = new Salad();
    }}
       /* Food[] foods = {chicken, ham, carrot, salad};
        for(Food food: foods)
        System.out.println("chicken = " + chicken.getTaste());
        System.out.println("ham = " + ham.getTaste());
        System.out.println("carrot = " + carrot.getTaste());
        System.out.println("salad = " + salad.getTaste());
    } */
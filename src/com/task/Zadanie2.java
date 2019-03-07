package com.task;

public class Zadanie2 {
    public static void main(String[] args) {
        int a = 105;

        if(a > 0) {
            System.out.println("mniejsze lub równe 0");
        }
        else if(a <= 10) {
            System.out.println("przedzial 1-10");
        }else if(a <=100){
            System.out.println("przedzial 11-100");
        }else if(a <1000) {
            System.out.println("przedzial 101-1000");
        }else{
            System.out.println("ponad 10000");
        }
    }

    public static void checkNumber(int a) {

    }
}

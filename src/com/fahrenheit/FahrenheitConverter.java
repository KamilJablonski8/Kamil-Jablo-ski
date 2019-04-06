package com.fahrenheit;

import java.util.Scanner;

public class FahrenheitConverter {

    public static void main(String[] args) {
        double c, f;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter fahrenheit value : ");
        f = scanner.nextInt();
        c = (f - 32) * 5 / 9;
        System.out.print(" Celsius value is : " + c);

    }
}

package com.Task1;

import java.sql.SQLOutput;
import java.util.EventListener;

public class Zadanie1 {
    public static void main(String[] args) {

//        // 1)
//        int a = 5;
//        int b = 10;
//
//        int result = a + b;
//        System.out.println(result);
//
//        result = a - b;
//        System.out.println(result);
//
//        result = a * b;
//        System.out.println(result);
//
//        // 2)
//        int c = 5;
//        result = c * c * c;
//        System.out.println(result);
//
//        // 3)
//        int x = 20;
//        int modulo = x % 2;
//        boolean isEven = modulo == 0;
//        System.out.println("Is even: " + isEven);
//
//        // 4)
//        int d1 = 8;
//        System.out.println("Number: " + d1 + " is divisible by 3&5 : " + (d1 % 3 == 0 && d1 % 5 ==0));
//        int d2 = 15;
//        boolean  dzielone3 = d2 % 3 == 0;
//        boolean dzielone5 = d2 % 5 == 0;
//        System.out.println("Number: " + d2 + " dzielony3i5 : " + (dzielone3 && dzielone5));
//
//        // 5)
//        char a1 = 65;
//        char a2 = 66;
//        char a3 = 67;
//        char a4 = 68;
//        char a5 = 69;
//        System.out.println("łacina: " +  a1 +   a2  +  a3  +  a4  +  a5);
////        System.out.println("a2 = " + a2);
////        System.out.println("a3 = " + a3);
////        System.out.println("a4 = " + a4);
////        System.out.println("a5 = " + a5);
//
//        char b1 = 1488;
//        char b2 = 1489;
//        char b3 = 1490;
//        char b4 = 1491;
//        char b5 = 1492;
//        System.out.println("b1 =" + b1);
//        System.out.println("b2=" + b2);
//        System.out.println("b3=" + b3);
//        System.out.println("b4=" + b4);
//        System.out.println("b5=" + b5);
//
//        char c1 = 3840;
//        char c2 = 3841;
//        char c3 = 3842;
//        char c4 = 3843;
//        char c5 = 3844;
//        System.out.println("c1=" + c1);
//        System.out.println("c2=" + c1);
//        System.out.println("c3=" + c3);
//        System.out.println("c4=" + c4);
//        System.out.println("c5=" + c5);
//
//        // 6)
//        char aa = 74;
//        char bb = 65;
//        char cc = 86;
//        char dd = 65;
//        char ee = 32;
//        char ff = 8658;
//        char gg = 32;
//        char hh = 9786;
//
//        System.out.println("[" + aa + "," + bb + "," + cc + "," + dd + "," + ee + "," + ff + "," + gg + "," + hh + "]");

        //#5 Wyświetl na ekranie pięć pierwszych liter alfabetu: łacińskiego (zaczyna się od kodu: 65), hebrajskiego (zaczyna się od: 1488) i tybetańskiego (zaczyna się od: 3840)
        char f = 65;
        System.out.print("First 5 letters of the Latin alphabet: " + f++);
        System.out.print(" " + f++);
        System.out.print(" " + f++);
        System.out.print(" " + f++);
        System.out.print(" " + f++);
        System.out.println();
        f = 1488;
        System.out.print("First 5 letters of the Hebrew alphabet: " + f);
        System.out.print(" " + ++f);
        System.out.print(" " + ++f);
        System.out.print(" " + ++f);
        System.out.print(" " + ++f);
        System.out.println();
        f = 3840;
        System.out.println("First 5 letters of the Tibetan alphabet: " + f + " " + ++f + " " + ++f + " " + ++f + " " + ++f);

        //#6 Wyświetl na ekranie w jednej linijce znaki (char) dla kodów: 74, 65, 86, 65, 32, 8658, 32, 9786
        System.out.print("Message from outhere: " + (char) 74 + (char) 65 + (char) 86 + (char) 65 + (char) 32 + (char) 8658 + (char) 32 + (char) 9786);
    }
}
package com.loop;

public class Loop {
    public static void main(String[] args) {
    printNumber(5);

    }

    static void printNumber (int limit) {
        int liczba = 2;
        for (int n = 1; n <= limit; n++){
            System.out.println(liczba);
            liczba = liczba+ 2;
            //Napisz metodę, która policzy n-tą potęgę (n >= 0) liczby całkowitej a.
            // Parametry metody to: n i a.

        }

    }
}

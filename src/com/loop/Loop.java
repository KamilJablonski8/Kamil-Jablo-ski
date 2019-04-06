package com.loop;

public class Loop {
    public static void main(String[] args) {
    printNumber(10);

    }

    static void printNumber (int limit) {
        String liczba = "Wszystkiego Najlepszego z Okazji Dnia Kobiet!!!";
        for (int n = 1; n <= limit; n++){
            System.out.println(liczba);
            liczba = liczba;
            //Napisz metodę, która policzy n-tą potęgę (n >= 0) liczby całkowitej a.
            // Parametry metody to: n i a.

        }

    }
}

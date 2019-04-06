package com.Exeption;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintTable {

    public static void main(String[] args) {
        try { // kod, w którym mogą powstawać wyjątki
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
            System.out.println(fruits[index]);
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("Wystąpił błąd: Próba dostepu do indeksu tablicy, która nie istnieje " );
            System.out.println("Błąd: Nie wprowadzono poprawnej liczby ");

        } finally {
            System.out.println("Koniec");
    }
}
}

        /* catch (ArrayIndexOutOfBoundsException aioobe) {   // obsługa wyjątku pierwszego: nie wprowadza int-a
            System.out.println("Wystąpił błąd: Próba dostepu do indeksu tablicy, która nie istnieje " + aioobe );
        } catch (InputMismatchException ime) {                   // obsługa wyjątku drugiego rodzaju: przekroczenie zakresów indeksów tablicy
            System.out.println("Błąd: Nie wprowadzono poprawnej liczby ");

        } finally {
            System.out.println("Koniec");
        }
    } */

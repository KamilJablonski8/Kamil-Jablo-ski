package com.Stat;

public class Math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int min(int a, int b) {
        if (a < b) {
            // (a < b ) ? a : b;
            // (a < b ) {return a; } else { return b; } //dokładnie to samo co wyżej
            return a;
        } else {
            return b;
        }
    }
    public static int pow(int a, int b){
        int wynik = 1;
        for (int i = 1; i <=b; i++){
            wynik = wynik *a;
        }
        return  wynik;
}

    public static void main(String[] args) {
        int addon = Math.add(3, 5);
        System.out.println(addon);

        int minos = Math.min(3, 5);
        System.out.println(minos);

        int pow = Math.pow(2, 3);
        System.out.println(pow);
    }
}

      /*  int a = 1;
        int b = 2;
        int c = 3;
        if (a < b){
            if (a < c ) {
            //    return a;

          //  return; b;



      //  System.out.println((a < b) ? ((a <c) ? a : c ) : b);
*/
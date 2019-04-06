package com.computerprice;

public class ComputerPrice {
    public static void main(String[] args) {


        double ram = 200;
        double hdd = 200;
        double proc = 150;
        double pg = 100;
        double monit = 100;

        double VAT = (1.23);
//
//    public void Variables(){
//        double reasult1 = (ram + hdd + pg + proc) * VAT;
//        double result2 = (ram + hdd + pg + proc + monit) * VAT;
//
//        System.out.println("Cena komputera " + reasult1 + " PLN");
//        System.out.println("Cena monitora " + result2 + " PLN");
//    }
//
//    public static void main(String[] args) {
//        ComputerPrice price = new ComputerPrice();
//        price.Variables();
//
//    }
//}
        double computerPrice = ram + hdd + pg + proc;
        System.out.println("Computer price " + computerPrice);
        System.out.println("Computer price + VAT " + computerPrice * VAT);

        double monitorAndComputerPrice = computerPrice + monit;
        System.out.println("Computer price and monitor " + monitorAndComputerPrice);
        System.out.println("Computer price and monit + VAT " + monitorAndComputerPrice * VAT);


    }
}
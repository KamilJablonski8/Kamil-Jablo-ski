package com.Enum;

public enum Currency {
    ZLOTY(2),
    DOLAR(6),
    EURO(4),
    JENY(8),
    POUND(5);

    private double waluta;

    Currency(double waluta) {
        this.waluta = waluta;
    }

    public double getWaluta() {
        return waluta;
    }
    /*private int PLN;
    private int USD;
    private int EUR;
    private int JPY;
    private int GBP;

    Currency(int PLN,int USD, int EUR, int JPY, int GBP){
        */
    }




package com.coinpo;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Car {
    public String brand;
    public String kolor;
    public Engine engine;
    private Entertaiment entertaiment;

    public Car(String brand, Engine engine, Entertaiment entertaiment){
        this.brand = brand;
        this.engine = engine;
        this.entertaiment = entertaiment;
    }

}

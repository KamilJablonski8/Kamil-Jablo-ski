package com.Maps;

import java.sql.SQLOutput;
import java.util.*;


public class Map1 {

    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(1, "jeden");
        numbers.put(2, "dwa");
        numbers.put(3, "trzy");
        numbers.put(4, "cztery");
        numbers.put(6, "sześć");

        System.out.println("map size " + numbers.size());
        Set<Integer> keySet = numbers.keySet();
        int k=0;
        for (Integer key : keySet) {
            String value = numbers.get(key);
            System.out.println(key + " = " + value);
            if (key<0) k++;
            System.out.println("Mniejsze od zera " + k + "większe równe: " + (numbers.size() -k));
            // for ( Integer key: keys)
           // System.out.println(key + "-" + numbers.get(key)); to samo



            }
        }
    }

package com.Boxes;

import java.util.List;

public class NumbersBox<T> {

   // public T getFirstElement() {
   //     if (isEmpty()) {
   //         return null;
     //   }
   // }


    private List<T> items;

    public NumbersBox(List<T> items) {
        this.items = items;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}

package com.Boxes;

public class Boxes<T extends Fruit> {
    private T item;

    public Boxes(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void isRotten() {
        item.isRotten();
    }
}


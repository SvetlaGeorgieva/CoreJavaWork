package com.hackbulgaria.corejava1.generics2;

public class Box<V> {
    private V value;

    public Box() {

    }

    public Box(V value) {
        set(value);
    }

    public void set(V value) {
        this.value = value;
    }

    public V get() {
        return this.value;
    }
}

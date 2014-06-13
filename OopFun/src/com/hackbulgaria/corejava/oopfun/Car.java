package com.hackbulgaria.corejava.oopfun;

public class Car {
    
    // fields
    private String brand;
    
    // constructor
    public Car(String brand) {
        this.brand = brand;
    }
    
    //methods
    @Override
    public String toString() {
        String prefix = this.brand + "@";
        
        String[] suffix = super.toString().split("@");
        return prefix.concat(suffix[1]);
    }
    
    public static void main(String[] args) {
        Car audi = new Car("Audi");
        Car opel = new Car("Opel");
        System.out.println(audi.toString());
        System.out.println(opel.toString());
    }
}

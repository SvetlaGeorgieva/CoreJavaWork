package com.hackbulgaria.corejava.oopfun;

public final class Pair {

    // fields -> two objects
    private final Object object1;
    private final Object object2;
    
    // constructor
    private Pair(Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }
    
    // methods:
    public Object object1()
    {
        return this.object1;
    }

    public Object object2()
    {
        return this.object2;
    }
    
    public static Pair createNewInstance(Object object1, Object object2) {
        return new Pair(object1, object2);
    }
    
    public boolean equals(Pair obj) {
        if (this.object1 == obj.object1 && this.object2 == obj.object2) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        
        Pair pair1 = Pair.createNewInstance(a, b);
        Pair pair2 = Pair.createNewInstance(a, b);
        
        System.out.println(pair1.equals(pair2));
    }

}

package com.hackbulgaria.corejava1.generics2;

public class Pair <F, S> {
    private F first;
    private S second;

    public Pair() {

    }

    public void setFirst(F first) {
        this.first = first;

    }

    public void setSecond(S second) {
        this.second = second;
        
    }
    
    @Override
    public String toString() {
        String result = "<" + this.first.toString() + ", " + this.second.toString() + ">";
        return result;

    }

    public F first() {
        return this.first;
    }

    public S second() {
        // TODO Auto-generated method stub
        return this.second;
    }

}

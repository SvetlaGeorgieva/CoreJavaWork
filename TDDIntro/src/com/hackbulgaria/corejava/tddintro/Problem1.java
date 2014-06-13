package com.hackbulgaria.corejava.tddintro;

public class Problem1 {
    public long getNumberOfDigits (int number) {
        String numberString = Integer.toString(number);
        char firstChar = numberString.charAt(0);
        
        if (Character.toString(firstChar).matches("[0-9]")) {
            return numberString.length();
        }
        return numberString.length() - 1;
    }
}

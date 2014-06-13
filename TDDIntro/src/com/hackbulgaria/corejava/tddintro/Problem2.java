package com.hackbulgaria.corejava.tddintro;

public class Problem2 {
    public String joinStrings(String glue, Object ...arr) {
        // za zada4a 3:
        // Stack<String> s = new Stack<String>();
        
        String c = "";
        for (int i = 0; i < arr.length; i++) {
            c = c.concat(arr[i].toString());
            c = c.concat(" ");
        }
        
        // removes the last space
        if (c == null || c.length() == 0) {
            return c;
        }
        return c.substring(0, c.length()-1);
    }
}

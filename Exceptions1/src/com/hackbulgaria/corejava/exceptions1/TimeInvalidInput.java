package com.hackbulgaria.corejava.exceptions1;

public class TimeInvalidInput extends RuntimeException {

    //constructor
    public TimeInvalidInput() {
        super("Your input was invalid. Constraints: hour (1-12), \n"
                + "minutes and seconds (1-60), day (1-31), \n"
                + "month (1-12), year (1-10000) ");
    }
}

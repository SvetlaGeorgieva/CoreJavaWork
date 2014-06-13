package com.hackbulgaria.corejava.oopfun;

import java.util.Date;

public class Time {

    // fields
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int seconds;
    
    //constructor
    /* The format should be: 
     * new Time( day, month, year, hour, minutes, seconds) */
    public Time(int day, int month, int year, int hour, int minutes, int seconds) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = month;
        this.seconds = seconds;
    }
    
    //methods
    @Override
    public String toString() {
        String day = String.valueOf(this.day);
        String month = String.valueOf(this.month);
        String year = String.valueOf(this.year);
        String hour = String.valueOf(this.hour);
        String minutes = String.valueOf(this.minutes);
        String seconds = String.valueOf(this.seconds);

        String formatted = String.format("%s:%s:%s %s.%s.%s", hour, minutes, seconds, day, month, year);
        
        return formatted;
    }
    
    public Date now() {
        Date d = new Date();
        return d;
    }
    
    public static void main(String[] args) {
        /* The format should be: 
         * new Time( day, month, year, hour, minutes, seconds) */
        Time time1 = new Time(1,10,2010,16,30,54);
        System.out.println(time1.toString());
        System.out.println(time1.now());
    }

}

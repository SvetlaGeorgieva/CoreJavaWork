package com.hackbulgaria.corejava.exceptions1;

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
                
        /* "Your input was invalid. Constraints: hour (1-12), \n"
                + "minutes and seconds (1-60), day (1-31), \n"
                + "month (1-12), year (1-10000) "
         */
        
        if ( hour < 0 || minutes < 0 || seconds < 0 || day < 0 || month < 0 || year < 0) {
            throw new TimeInvalidInput();
        }
        if ( hour > 24 || minutes > 60 || seconds > 60 || day > 31 || month > 12 || year > 10000) {
            throw new TimeInvalidInput();
        }
        
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
    
    
    public static void main(String[] args) {
        /* The format should be: 
         * new Time( day, month, year, hour, minutes, seconds) */
        Time time1 = new Time(1,10,2010,16,30,54);
        System.out.println(time1.toString());
        Time time2 = new Time(100,10,2010,16,30,54); // invalid
        System.out.println(time2.toString());
    }

}

package com.hackbulgaria.corejava.exam1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateLogger extends Logger {

    // Assigns the given level to the logger.
    public DateLogger (int level) {
        super();
    }
    
    public static String timeNowFormatted() {
        Date timeNow = new Date();
        //|22:14:01 14.06.2014|
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("|HH:mm:ss dd.MM.yyyy|");
        String date = DATE_FORMAT.format(timeNow);
        return date;
    }
    
    @Override
    protected void tryPrintLog(int messageLevel, String message) {
        if (messageLevel <= this.level) {
            String timeNow = DateLogger.timeNowFormatted();
            System.out.println(timeNow + " " + messageLevel + " => " + message );
        }
    }
    
    public static void main(String[] args) {
        DateLogger logger = new DateLogger(3);
        logger.log(2, "Somewhat important message"); //gets logged as "2 => Somewhat important message"
        logger.log(3, "Less important message"); // also gets logged!
        logger.log(5, "Not important"); //this is less important than LEVEL, so it will **not be logged**.
        logger.log("Meh"); //overload without a LEVEL parameter, use 3 as default.

        logger.setLevel(2);
        logger.log("My message"); //does not get printed!
        logger.log(2, "Somewhat important message"); //gets logged as "2 => Somewhat important message"

        logger.setLevel(-3);

    }

}

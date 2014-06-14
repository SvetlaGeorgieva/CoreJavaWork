package com.hackbulgaria.corejava.exam1;

public class DateLogger extends Logger {

    // Assigns the given level to the logger.
    public DateLogger (int level) {
        super();
    }
    
    @Override
    protected void tryPrintLog(int messageLevel, String message) {
        if (messageLevel <= this.level) {
            System.out.println("Level " + messageLevel + " => " + message );
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

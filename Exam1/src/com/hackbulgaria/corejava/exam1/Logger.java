package com.hackbulgaria.corejava.exam1;

public class Logger {

    // fields
    protected int level;
    
    // constructors
    // The default logger level is 3.
    public Logger () {
       this.level = 3; 
    }

    // Assigns the given level to the logger.
    protected Logger (int level) {
        this.level = level;
    }
    
    // methods    
    protected void tryPrintLog(int messageLevel, String message) {
        if (messageLevel <= this.level) {
            System.out.println("Level " + messageLevel + " => " + message );
        }
    }
    
    public void setLevel (int level) {
        if(level < 0) {
            throw new LoggerInvalidLevel();
        }
        this.level = level;
    }
    
    public void log (String message) {
        tryPrintLog(3, message);
    }
    
    // Overloading log with declared level.
    public void log (int messageLevel, String message) {
        tryPrintLog(messageLevel, message);
    }
    
    public static void main(String[] args) {
        Logger logger = new Logger(3);
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

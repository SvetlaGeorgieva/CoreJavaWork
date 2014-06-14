package com.hackbulgaria.corejava.exam1;

public class Logger {

    // fields
    private int level;
    private int messageLevel;
    private String message;
    
    // constructors
    // The default logger level is 3.
    public Logger () {
       this.level = 3; 
    }

    // Assigns the given level to the logger.
    public Logger (int level) {
        this.level = level;
    }
    
    // methods
    private void setMessageLevel (int messageLevel) {
        this.messageLevel = messageLevel;
    }

    private void setMessage (String message) {
        this.message = message;
    }
    
    public void log (String message) {
        this.setMessageLevel(3);
        this.setMessage(message);
    }
    
    // Overloading log with declared level.
    public void log (int messageLevel, String message) {
        this.setMessageLevel(messageLevel);
        this.setMessage(message);
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

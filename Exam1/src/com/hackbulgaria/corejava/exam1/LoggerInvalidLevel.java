package com.hackbulgaria.corejava.exam1;

public class LoggerInvalidLevel extends RuntimeException {

    public LoggerInvalidLevel() {
        super("The logger level was invalid. \nMake sure the value you enter is > 0.");
    }
    
}

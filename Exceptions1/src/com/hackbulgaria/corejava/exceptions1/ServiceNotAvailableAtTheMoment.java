package com.hackbulgaria.corejava.exceptions1;

public class ServiceNotAvailableAtTheMoment extends Exception {
  
    //constructor
    public ServiceNotAvailableAtTheMoment() {
        super("Service not available at the moment. You could check your network connection, firewall settings or router.");
    }
    
}

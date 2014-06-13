package com.hackbulgaria.corejava.exceptions1;

public class Service {

  //constructor
    public Service (){
    }
    
    //method that throws unchecked exception
    public void useService() throws ServiceNotAvailableAtTheMoment {
        throw new ServiceNotAvailableAtTheMoment();
    }
    
    public static void main(String[] args) {
       try {
           Service a = new Service();
           a.useService();
       }
       catch (ServiceNotAvailableAtTheMoment ex) {
           ex.printStackTrace();
       }
    }

}

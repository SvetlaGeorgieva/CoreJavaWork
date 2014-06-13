package com.hackbulgaria.corejava.exceptions1;

import javax.xml.crypto.Data;

/* Solution with Checked Exception */
//public class DatabaseCorruptedException extends Exception{
//
//    //constructor
//    public DatabaseCorruptedException() {
//        super("DatabaseCorruptedException: Username is empty.");
//    }
//    
//}

/* Solution with Unchecked Exception */
public class DatabaseCorruptedException extends RuntimeException{

  //constructor
  public DatabaseCorruptedException() {
      super("DatabaseCorruptedException: Username is empty.");
  }
  
}

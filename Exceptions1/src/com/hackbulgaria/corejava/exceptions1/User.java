package com.hackbulgaria.corejava.exceptions1;


/* Solution with Checked Exception */
//public class User {
//
//    //fields
//    private String username;
//    
//    //constructor
//    public User (String username) throws DatabaseCorruptedException {
//        if (username.equals("")) {
//            throw new DatabaseCorruptedException();
//        } else {
//        this.username = username;
//        }
//    }
//    
//    public static void main(String[] args) {
//        try {
//            User user1 = new User("");
//        }
//        catch (DatabaseCorruptedException ex) {
//            ex.printStackTrace();
//            return;
//        }                
//    }
//}

/* Solution with Unchecked Exception */
public class User {

  //fields
  private String username;
  
  //constructor
  public User (String username){
      if (username.equals("")) {
          throw new DatabaseCorruptedException();
      } else {
      this.username = username;
      }
  }
  
  public static void main(String[] args) {
      User user1 = new User("");
  }
}

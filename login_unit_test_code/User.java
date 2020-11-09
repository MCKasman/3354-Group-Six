// User.java

import java.util.HashMap;

public class User {
	
  // declare and initialize login variables
	String userID;
  String password;
  String loginStatus;
  
  // create HashMap acting as login database
  HashMap<String, String> logins;
  
  // constructor for login database
  public User(){
  	logins = new HashMap<String, String>();
    
    // dummy account info
    // add keys and values ("EMAIL","PASSWORD")
    logins.put("JohnDoe@gmail.com", "idkwhoiam123");
    logins.put("ChickenLittleBenson@utdallas.edu", "whoosh");
    logins.put("Sid.Devic@utdallas.edu", "imACMawesome");
  }
  
	public boolean verifyLogin(String username, String password) {
  	// checks if any of inputs are empty
  	if(username.equals("") || password.equals(""))
    	return false;
  	// first if statement: checks if email exists in HashMap
		if(logins.containsKey(username)){
    	// second if statement: checks if password matches in HashMap
    	if(logins.get(username).equals(password)){
      	return true;
      }
    } 
    return false;
	}
}
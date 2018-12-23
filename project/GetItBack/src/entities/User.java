package entities;

import java.util.ArrayList;

public abstract class User {

  public String name;

  private int password;

  public String address;

  public Integer phone;

  public String type;

    public ArrayList<Post>  myPost;
 
  
  public ArrayList<User>  myUsers;

  public void setPassword(int Password) {
	  password = Password;
  }

  public int getPassword() {
  return password;
  }

}
package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5DependsOn {
	
  @Test(description="Login TestCase")
  public void loginmethod() {
	  Reporter.log("login performed!!",true);
  }
  
  @Test(description="CreateUser TestCase",dependsOnMethods = "loginmethod")
  public void createuser() {
	  Reporter.log("User Created!!",true);
  }
  
  @Test(description="LogOut TestCase",dependsOnMethods = "createuser")
  public void logoutmethod() {
	  Reporter.log("logOut performed!!",true);
  }
}

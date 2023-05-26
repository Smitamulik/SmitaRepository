package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3InvocationCount {
	
	//use to execute annotation or method multiple time
	
  @Test(invocationCount=05)
  public void method1() 
  {
	  Reporter.log("Login tEST Perform",true);
  }
}

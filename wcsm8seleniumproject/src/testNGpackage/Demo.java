package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 // System.out.println("Hi Testing!!!");
	  Reporter.log("Hi Testing",true);
  }
  @Test
  public void g()
  {
	 // System.out.println("Hi Java!!!");
	  Reporter.log("Hi Java",true);
	  
  }
}

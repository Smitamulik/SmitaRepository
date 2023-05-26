package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4Priority {
	
	//Execute the annotations or methods according to priority
  @Test
  public void f() {
	  Reporter.log("f method",true);
  }
  @Test
  public void a() {
	  Reporter.log("a method",true);
}
  @Test
  public void b() {
	  Reporter.log("b method",true);
}
  @Test(priority=1)
  public void c() {
	  Reporter.log("c method",true);
}
  @Test(priority=-1)
  public void d() {
	  Reporter.log("d method",true);
	  
}
  @Test(priority=1)
  public void e() {
	  Reporter.log("e method",true);
}
  @Test
  public void g() {
	  Reporter.log("g method",true);
}
  @Test
  public void h() {
	  Reporter.log("h  method",true);
}
}
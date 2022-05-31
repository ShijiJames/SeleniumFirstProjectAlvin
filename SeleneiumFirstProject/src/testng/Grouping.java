package testng;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups= {"high"},priority=2)
  public void f1() {
	  System.out.println("f1 called");
  }
  @Test(groups= {"critical"},priority=0)
  public void f2() {
	  System.out.println("f2 called");
  }
  @Test(groups= {"high"},priority=1)
  public void f3() {
	  System.out.println("f3 called");
  }
  @Test(priority=4)
  public void f4() {
	  System.out.println("f4 called");
  }
  @Test(priority=3)
  public void f5() {
	  System.out.println("f5 called");
  }
}

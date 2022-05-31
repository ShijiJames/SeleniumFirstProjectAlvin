package testng;

import org.testng.annotations.Test;

public class BasicTestNG {
  @Test(enabled = false)
  public void testCase1VerifyABCCheckboxSelected() {
	  
	  System.out.println("test 1 Executed*");
  }
  @Test(priority = 1)
  public void testCase2DropDownABCSelectedValue() {
	  
	  System.out.println("test 2 Executed**");  
  }
  @Test(priority = 3)
  public void testCase3VerifyPageTitleAfterLoggin() {
	  
	  System.out.println("test 3 Executed***");
  }
  @Test(priority = 2)
  public void testCase4() {
	  System.out.println("test 4 Executed****");
  }
}

package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
//	@DataProvider(name = "dataProvider")
//	public Object[][] dpMethod(){
//		return new Object[][] {{2, 8 }, {5, 7},{8,9}};
//	}

	
  @Test(dataProvider="dataProvider",dataProviderClass=DataProviderCls.class)
  public void testcase0(int a,int b) {
	  int c = a + b;
		System.out.println("The sum is ="+c);
  }
}

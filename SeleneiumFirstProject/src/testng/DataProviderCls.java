package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCls {
	@DataProvider(name = "dataProvider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 8 }, {5, 7},{8,9}};
	}
}

package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
	@Test
	@Parameters({ "val1", "val2" })
	public void tsetCase1(int a, int b) {

		int c = a + b;
		System.out.println(c);
	}
}

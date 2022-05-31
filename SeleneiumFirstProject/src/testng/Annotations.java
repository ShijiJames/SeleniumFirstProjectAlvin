package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	/*
	 * @BeforeMethod public void beforeMethod() {
	 * System.out.println("before methode is executed"); }
	 * 
	 * @AfterMethod public void afteMethod() {
	 * System.out.println("after methode is executed"); }
	 */
	//@BeforeTest and @AfterTest
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class is executed");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class is executed");
	}
	@Test
	public void testCase1VerifyABCCheckboxSelected() {

		System.out.println("test 1 Executed*");
	}

	@Test
	public void testCase2DropDownABCSelectedValue() {

		System.out.println("test 2 Executed**");
	}

	@Test
	public void testCase3VerifyPageTitleAfterLoggin() {

		System.out.println("test 3 Executed***");
	}

	@Test
	public void testCase4() {
		System.out.println("test 4 Executed****");
	}
}

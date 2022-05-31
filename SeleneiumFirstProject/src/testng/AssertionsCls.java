package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsCls {
	WebDriver driver;
	@Test
	public void verifyLoginButtonText() {
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login-button']"));
		String expected="LOGIN1";
		String actualResult=login.getText();
		//Hard assertion: if test fail it will stop there itself
		//Assert.assertEquals(actualResult, expected,"Login Button not expected");
		
		//Soft assertion or verify(other name of soft assertion)
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualResult, expected,"Login Button not expected");
		System.out.println("soft assetion executes all other lines");
		softAssert.assertAll();// assertAll() is need if using soft assert ..otherwise it will show as Test pass
	}

	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
	}

	@AfterMethod
	public void afteMethod() {
		driver.close();
	}

}

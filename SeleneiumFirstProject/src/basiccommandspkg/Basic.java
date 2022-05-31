package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qabible.in/payrollapp/site/login");
		WebElement login = driver.findElement(By.xpath("//button[@name='login-button']"));
		System.out.println(login.getText());
		System.out.println(login.getTagName());
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getAccessibleName());
		System.out.println(login.getAttribute("class"));
		System.out.println(login.getCssValue("background-color"));
		System.out.println(login.getCssValue("color"));    
		System.out.println(login.getCssValue("font-family")); 
		System.out.println(login.getCssValue("font-size")); 
		driver.close();
	}

}

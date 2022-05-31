package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver","C:\\SeleniumFiles\\msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password=driver.findElement(By.xpath("//input[@name='LoginForm[password]']"));
		password.sendKeys("1q2w3e4r");
		WebElement login=driver.findElement(By.xpath("//button[@name='login-button']"));
		login.click();
		//driver.close();

	}

}

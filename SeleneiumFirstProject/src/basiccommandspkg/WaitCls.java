package basiccommandspkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit
		// wait;once declared its till end
		WebElement username = driver.findElement(By.xpath("//input[@id='loginform-username']"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.xpath("//input[@id='loginform-password']"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		login.click();
		// here page load happens
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium 3;
		// not used now
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Clients")));

		WebElement clientTab = driver.findElement(By.linkText("Clients"));
		clientTab.click();

		// fluent wait

		/*
		 * Wait<WebDriver> fluentWait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
		 * .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		 * fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(
		 * "Clients")));
		 */
	}

}

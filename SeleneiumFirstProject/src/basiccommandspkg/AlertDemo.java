package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");

		WebElement clickme = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme.click();
		driver.switchTo().alert().accept();// to handle alert

		WebElement clickme2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		driver.switchTo().alert().dismiss();// to cancel alert

		// System.out.println(driver.switchTo().alert().getText());//to get the text on the alert

		// Thread.sleep(3000);
		WebElement clickme3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickme3.click();
		driver.switchTo().alert().sendKeys("Hai");
		driver.switchTo().alert().accept();
	}

}

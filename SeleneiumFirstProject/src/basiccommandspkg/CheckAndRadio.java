package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAndRadio {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		WebElement checkbx=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbx.click();
		System.out.println(checkbx.isSelected());
		WebElement radioTab=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
		radioTab.click();
		WebElement radiobx=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobx.click();
		System.out.println(radiobx.isSelected());
		radiobx.isSelected();
		driver.close();

	}

}

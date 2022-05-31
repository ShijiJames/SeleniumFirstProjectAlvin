package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnsDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source = driver.findElement(By.xpath("(//li[@id='fourth']//a[contains(text(),'5000')])[1]"));
		WebElement destination = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		WebElement source2 = driver.findElement(By.xpath("//li[@id='credit2']//a[contains(text(),'BANK')]"));
		WebElement destination2 = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));

		action.dragAndDrop(source2, destination2).perform();
	}

}

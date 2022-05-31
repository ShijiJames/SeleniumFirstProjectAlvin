package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardNMouseAct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions action = new Actions(driver);
		// action.contextClick().perform();
		// button[@id='rightClickBtn']
		WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		action.contextClick(rightClick).perform();
		//button[@id='doubleClickBtn']
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		action.doubleClick(doubleClick).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
	}
}

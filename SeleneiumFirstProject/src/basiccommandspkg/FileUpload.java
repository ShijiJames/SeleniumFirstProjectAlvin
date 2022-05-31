package basiccommandspkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/selenium/upload/");

		Actions action = new Actions(driver);

		WebElement upload = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		// upload.click();
		action.moveToElement(upload).click().perform();//mouseover as its a input tag

		StringSelection s = new StringSelection(
				"C:\\Users\\shiji\\OneDrive\\Desktop\\FileFolder\\SeleniumAssignment.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);

		Robot robo = new Robot();
		robo.delay(250);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.delay(250);
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();

	}

}

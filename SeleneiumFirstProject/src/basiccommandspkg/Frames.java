package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		// driver.switchTo().frame("frame1");//1st method of switching to iframe using
		// frame id/name
		// driver.switchTo().frame(7);//2nd method of switching to iframe using index
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame);// 3rd method of switching to iframe using webelement
		WebElement frameText = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameText.getText());
		driver.switchTo().parentFrame();// to switch back to parent frame
		driver.close();
	}

}

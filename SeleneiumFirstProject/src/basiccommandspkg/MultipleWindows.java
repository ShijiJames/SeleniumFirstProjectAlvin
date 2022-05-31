package basiccommandspkg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		WebElement newtab=driver.findElement(By.xpath("//button[@id='tabButton']"));
		newtab.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		Iterator<String> iterator=allWindowHandles.iterator();
		while(iterator.hasNext())
		{
			String childWindow=iterator.next();
			if(!parentWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				WebElement newtabElement=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
				System.out.println(newtabElement.getText());
			}
			
		driver.switchTo().window(parentWindow);
			
		
	}

}
}

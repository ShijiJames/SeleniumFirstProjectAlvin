package basiccommandspkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement passengers=driver.findElement(By.xpath("//select[@name='passCount']"));
		Select dropdown=new Select(passengers);
		dropdown.selectByIndex(1);
		//dropdown.selectByVisibleText("2");
		//dropdown.selectByValue("4");
		WebElement selectedEle=dropdown.getFirstSelectedOption();
		System.out.println(selectedEle.getText());
		
		
	}

}

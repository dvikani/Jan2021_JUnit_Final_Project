package validate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate {
	WebDriver driver;
	
	@Before
	public void launchBrower() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
	}
	
	@Test
//	Test 1: Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.

	public void validatethetoggleallcheckboxisChecked() {
		driver.findElement(By.name("allbox")).click();
	}
//		Test 2: Validate that a single list item could be removed using the remove button when a single checkbox is selected.
		
	public void removeButton() {
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
	}
		

			
		
		
	@After
	public  void tearDown() {
		driver.close();
		driver.quit();
	}
}

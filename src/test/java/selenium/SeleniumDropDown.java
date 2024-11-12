package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumDropDown {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 String baseURL = "https://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("BAHAMAS");
		drpCountry.selectByValue("AMERICAN SAMOA");
		drpCountry.selectByIndex(6);
		Thread.sleep(5000);
		drpCountry.deselectByIndex(6);

		//Selecting Items in a Multiple SELECT elements
//		driver.get("http://jsbin.com/osebed/2");
//		driver.manage().window().maximize();
//		Select fruits = new Select(driver.findElement(By.id("fruits")));
//		fruits.selectByVisibleText("Banana");
//		fruits.selectByIndex(1);
//		fruits.deselectAll();

		
		
		
	
	}
	

}

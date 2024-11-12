package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDynamicSuggestions {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
		 String baseURL = "https://www.flipkart.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div//input[@title='Search for Products, Brands and More']")).sendKeys("oppo mobile 5g2024");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//driver.findElement(By.xpath("//div[text()='5g2024']")).click();
	
	
	}
	

}

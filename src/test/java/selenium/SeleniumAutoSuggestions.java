package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAutoSuggestions {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
						
		WebDriver driver= WebDriverManager.chromedriver().create();
		 String baseURL = "https://www.makemytrip.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(4000);
		from.sendKeys("Sydney");
		Thread.sleep(4000);
		from.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		from.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
			
	}
	

}

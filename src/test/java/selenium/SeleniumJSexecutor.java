package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumJSexecutor {
	
	@Test
	
	public void browserLogn() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        
		driver.get("https://nycdoedev2.service-now.com/login.do");
		
		//saving login button element
		WebElement button= driver.findElement(By.cssSelector(".btn.btn-primary"));
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		
		//Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", button);
		
		Thread.sleep(4000);
		
		 //To generate Alert window using JavascriptExecutor. Display the alert message 			
        js.executeScript("alert('Welcome to ServiceNow');");
        
		//driver.quit();
		
	}
}

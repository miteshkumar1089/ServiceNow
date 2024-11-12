package selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumESCorJSE {
	
	@Test
	
public void alert() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Method 2: Launch Google.com			
	    						
	        driver.get("http://www.google.co.in");							

	    // Method 3: Perform a search using "Facebook"	
	        
	  	        
	       WebElement element= driver.findElement(By.xpath(".//*[@title='Search']"));
	       element.sendKeys("Facebook");
	       
	       //TAB to be used for escape button
	       Actions action = new Actions(driver); 
	       action.sendKeys(Keys.TAB).build().perform();
	       
	       // element.sendKeys(Keys.ESCAPE);
	       
	    // To click on Google search button
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement we= (WebElement) js.executeScript("return document.querySelector('.gNO89b')");
	   ((JavascriptExecutor)driver).executeScript("arguments[0].click()",we);
	   
	    // Method 4: Verify Google search page title.							
//	        driver.findElement(By.xpath("//input[@value='Google Search']")).click();				
//	        Thread.sleep(3000);		
//	        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);		
        
}
	}

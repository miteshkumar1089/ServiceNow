package selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumToolTip {
	
	@Test
	
public void toolTip() throws InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		
		 WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Alert Message handling
		
		 String baseUrl = "https://demo.guru99.com/test/tooltip.html";
	        				
	        String expectedTooltip = "What's new in 3.2";					
	        driver.get(baseUrl);	
	        
	        WebElement download = driver.findElement(By.xpath("//*[@id='download_now']"));							
	        Actions builder = new Actions (driver);							
				
	        builder.moveToElement(download).build().perform(); 	
	        
	        WebElement toolTipElement = driver.findElement(By.xpath("//*[@class='box']/div/a"));							
	        String actualTooltip = toolTipElement.getText();		
	        
	        System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	        
	        if(actualTooltip.equals(expectedTooltip)) {							
	            System.out.println("Test Case Passed");					
	        }		
	        driver.close();
	        
        
}
	}

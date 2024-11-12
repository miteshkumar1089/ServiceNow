package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowAssetPortal {
	
	@Test
	
	public void assetPortal() throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
		
		//login ServiceNow
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//Launch asset portal
		driver.get("https://nycdoedev2.service-now.com/sp");

		//Open View asset
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'View all the assets assigned')]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[contains(text(),'My Site Assets')]")).click();
		
		//Check number of columns in the table and break if Site is found
		Thread.sleep(5000);
		List<WebElement> columns= driver.findElements(By.xpath("//table//tr//th"));
		
	   for(WebElement item: columns)
	   {
		 String col=item.getText();  
	     System.out.println(col);
	     
	     if(col.equalsIgnoreCase("Site"))
	    {
	    	 System.out.println("Able to locate columns");
	    	 break;
	     }
	   }
	   
	   //Get serial number for the 4th row and 2nd column
	   
	   WebElement serial=  driver.findElement(By.xpath("//table//tr[4]//td[2]"));
	   System.out.println(serial.getText());
	   
	   System.out.println("============================");
	   
	 //Get all serial numbers from the 2nd column
	   
	  List<WebElement> column2=driver.findElements(By.xpath("//table//tr"));
	   int size= column2.size();
	   
	   System.out.println(size);
	   
	   for(int i=1;i<size;i++)
	   {
	   
		  WebElement secondCol= driver.findElement(By.xpath("//table//tr["+i+"]//td[2]"));
		  System.out.println(secondCol.getText());
		  
	   }
	   
	}
}

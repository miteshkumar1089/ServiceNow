package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWindowsSnow {
	
	@Test
	
public void alert() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.get("https://nycdoedev2.service-now.com/com.glideapp.servicecatalog_cat_item_guide_view.do?v=1&sysparm_initial=true&sysparm_guide=1a602a171bfb2c10ec6254ea234bcbf6");		
    driver.manage().window().maximize();	
    
    //selecting user from lookup lens 
    
  driver.findElement(By.xpath("//a[@id='lookup.IO:f58e69631ba32010ec6254ea234bcb1c']")).click();
    
    		
     String MainWindow=driver.getWindowHandle();		
     			
        Set<String> s1=driver.getWindowHandles();		
    Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
               driver.switchTo().window(ChildWindow);
               
               WebElement user= driver.findElement(By.xpath("//input[@id='sys_user_table_header_search_control']"));
            		  user.sendKeys("Mkumar6");  
            		  user.sendKeys(Keys.ENTER);
            		  
              
                driver.findElement(By.xpath("//td//a[text()='MKumar6']")).click();			
                             
		// Closing the Child Window.
                    driver.close();		
        }		
    }		
    // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
        
}
    }

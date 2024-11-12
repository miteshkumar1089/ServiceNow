package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSNowEOC {
	
	@Test
	
public void eocSlushbucket() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.get("https://nycdoedev2.service-now.com/com.glideapp.servicecatalog_cat_item_guide_view.do?v=1&sysparm_initial=true&sysparm_guide=e1a19c1087d9a150a3f28446cebb35ba");		
        driver.manage().window().maximize();	
    
        //Add requestor
        
        WebElement requestor= driver.findElement(By.xpath("//div[@class='input-group']//*[contains(@ac_order_by,'name')]"));
        
        requestor.sendKeys("Mkumar6");
        requestor.sendKeys(Keys.RETURN);
        
        //Add Site Information
        
        driver.findElement(By.xpath("//input[@id='u_dbns_affected_cmn_location']")).sendKeys("A034@M860");
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//option[contains(text(),'A034@M860')]")).click();
        driver.findElement(By.xpath("//a[@id='add_to_collection_button']")).click();
        
        //Add Type of Incident
        
        driver.findElement(By.xpath("//a[@id='lookup.IO:898daeba87c9ad10f2d7eb5d0ebb3548']")).click();
        
        String MainWindow=driver.getWindowHandle();		
        			
           Set<String> s1=driver.getWindowHandles();		
       Iterator<String> i1=s1.iterator();		
       		
       while(i1.hasNext())			
       {		
           String ChildWindow=i1.next();		
           		
           if(!MainWindow.equalsIgnoreCase(ChildWindow))			
           {    		
                  driver.switchTo().window(ChildWindow);
                  
                  WebElement user= driver.findElement(By.xpath("//input[@id='sc_cat_item_table_header_search_control']"));
               		  user.sendKeys("Building unusable due to heat loss");  
               		  user.sendKeys(Keys.ENTER);
               		  
                 
                   driver.findElement(By.xpath("//td//a[contains(text(),'Building unusable due to heat loss')]")).click();		
                                
              //driver.close(); - since it is automatically getting closed so this statement will produce error
           }		
       }		
           
       driver.switchTo().window(MainWindow);
        
       // Enter Description
       
       Thread.sleep(5000);
       
        driver.findElement(By.xpath("//div//textarea[@aria-required='true']")).sendKeys("Test");    
        
        // select Operational Impact
        
        Select drpdownOI = new Select(driver.findElement(By.name("IO:0ec6804f87cdad10f2d7eb5d0ebb3519")));
        drpdownOI.selectByVisibleText("Minimal");
        
        // Select Evacuation or Relocation
        
        Select drpdownER = new Select(driver.findElement(By.name("IO:1f074c0f87cdad10f2d7eb5d0ebb3570")));
        drpdownER.selectByVisibleText("Partial Evacuation");
        
        // Enter OORS Control Number
        
        driver.findElement(By.xpath("//input[@id='IO:4057c84f87cdad10f2d7eb5d0ebb3563']")).sendKeys("55555");
        
        // Click Possible Press Involvement
        driver.findElement(By.xpath("//label[@id='ni.IO:5837c84f87cdad10f2d7eb5d0ebb355c_label']")).click();
        
        //Select Occurrence Date
        //we can directly pass the date in accepted format
        
        driver.findElement(By.id("IO:3f3ae8c387f225509d3d862e0ebb35a6")).sendKeys("2024-08-11 07:15:06 PM");
        
//        driver.findElement(By.xpath("//a[@data-original-title='Choose date...']")).click();
//        String monthYear= driver.findElement(By.id("GwtDateTimePicker_month")).getText();
//        System.out.println(monthYear);
//        
//        while(!(monthYear.equalsIgnoreCase("June 2024"))) 
//        		{
//    		driver.findElement(By.xpath("//td[@title='Next month']")).click();
//    		String monthYearVal = driver.findElement(By.id("GwtDateTimePicker_month")).getText();
//    		System.out.println(monthYearVal);
//    		
//    		monthYear=monthYearVal;
//    		
//        		}
//        
//        driver.findElement(By.xpath("//a[text()='20']")).click();
//        driver.findElement(By.xpath("//button[@aria-label='Save (Enter)']")).click();
        
     // Click on Next button
		  
		  
		  driver.findElement(By.cssSelector("#next_page_footer")).click();
		  
		// Click on Save & Submit button on next page
		  
          Thread.sleep(5000);
		  
		  driver.findElement(By.cssSelector("#next_page")).click();  
		  
		// Get ticket number
		  Thread.sleep(10000);
		  
		String ticketNumber= driver.findElement(By.xpath("//input[@id='sys_readonly.incident.number']")).getAttribute("value");
		System.out.println(ticketNumber);
}
}

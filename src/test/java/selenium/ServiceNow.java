package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	
	@Test
	
	public void browser() throws InterruptedException, AWTException {
		
		
//		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		
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
		
		//Find attribute and css value of Issue details option
		String cssV= driver.findElement(By.xpath("//a[text()='Issue Details']")).getCssValue("background-color");
		System.out.println(cssV);
	    String cssV1= driver.findElement(By.xpath("//a[text()='Issue Details']")).getAttribute("aria-hidden");
	    System.out.println(cssV1);
	    
	    //Add Requestor
		
	   driver.findElement(By.xpath("//div[@class='input-group']//*[contains(@ac_order_by,'name')]")).sendKeys("Mkumar6");
	   	
	 //Add Multilingual Support Required
	   String str= "yes";
	   	
	    Thread.sleep(4000);
	    WebElement drpDwn= driver.findElement(By.xpath("//select[@name='IO:ca3b4e401b44fc10ec6254ea234bcbdf']"));
	    Select options = new Select(drpDwn);
	    options.selectByValue(str);
	    
	    if (str.equalsIgnoreCase("yes")) {
	    WebElement drpDwn1=driver.findElement(By.xpath("//select[@name='IO:e24d02c01b44fc10ec6254ea234bcbd7']"));
	    Select op2= new Select(drpDwn1);
	    op2.selectByVisibleText("Bengali");
	    }
	    
	    else {
	    	System.out.println("Dropdown is set to No or not selected");
	    }
	    
	    // Select source
	    Thread.sleep(4000);
	    Select source = new Select(driver.findElement(By.name("IO:0170a0b21bdabc10ec6254ea234bcba8")));
	    source.selectByVisibleText("Outbound Call");
	    
	 // Select Contact preferences
	   //driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']")).click();
	    
	    //driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//child::input")).click();
	    //driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//input")).click();
//	   boolean b= driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//child::input")).isSelected();
//		System.out.println(b);
		
		
		//Selecting Reported for
		
		driver.findElement(By.xpath("//label[text()='Reporting for Student']")).click();
		driver.findElement(By.xpath("//label[text()='Student ID']")).click();
		driver.findElement(By.name("IO:97bb65ef876ba05053e97778cebb353c")).sendKeys("251383634");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//table[@class='drag_section_header']//tbody//span")).click();
		//driver.switchTo().alert().dismiss();
		
		//Site selection
		
		Thread.sleep(4000);
		
		WebElement site= driver.findElement(By.xpath("(//div[@class='input-group']//child::input)[5]"));
				
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", site);
				
		site.sendKeys("X001@X001");
		site.sendKeys(Keys.ARROW_DOWN);
		site.sendKeys(Keys.ENTER);
				
		
		//Description
		
		driver.findElement(By.xpath("//div//textarea[@aria-required='true']")).sendKeys("Test");
		
		//Catalog selection
		
		 Thread.sleep(4000);
		
      WebElement catalog= driver.findElement(By.xpath("(//div[@class='input-group']//child::input)[10]"));
		
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		  executor1.executeScript("arguments[0].scrollIntoView(true);", catalog);
		
		  catalog.sendKeys("Access to a public folder");
		  catalog.sendKeys(Keys.ARROW_DOWN);
		  catalog.sendKeys(Keys.ENTER);
		  
		// Click on Next button
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.cssSelector("#next_page_footer")).click();
		  
		// Attachment on the Next page
		  
		//PRESS ATTACHMENT BUTTON
			driver.findElement(By.xpath("//button[@id='sc_attachment_button']")).click();
			Thread.sleep(2000);
			//PRESS CHOOSE FILE BUTTON
			 driver.findElement(By.xpath("//button[contains(text(),'Choose file')]")).click();
			 Robot rb = new Robot();
			 rb.delay(2000);

		        //Storing FILEPATH
		        StringSelection str2 = new StringSelection("C://Users//miteshkumar//OneDrive - Nagarro//Desktop//DSD3-833_31st Oct.docx");
		        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str2, null);

		        //PRESS TAB KEY TO FIND "Search Documents" FIELD
		        for (int i = 0; i < 7; i++) {  // Adjust the number of TAB presses as needed
		            rb.keyPress(KeyEvent.VK_TAB);
		            rb.keyRelease(KeyEvent.VK_TAB);
		            Thread.sleep(300); // Short delay between key presses
		        }
	             //PASTING THE FILEPATH
		        rb.keyPress(KeyEvent.VK_CONTROL);
		        rb.keyPress(KeyEvent.VK_V);
		        rb.keyRelease(KeyEvent.VK_V);
		        rb.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(3000);
		        //PRESS DOWN KEY TO NAVIGATE TO THE CORRECT FILE
		        rb.keyPress(KeyEvent.VK_DOWN);  // Navigate through the suggestion 
		        rb.keyRelease(KeyEvent.VK_DOWN);
		        rb.keyPress(KeyEvent.VK_DOWN);  
		        rb.keyRelease(KeyEvent.VK_DOWN);
		        rb.keyPress(KeyEvent.VK_DOWN);  
		        rb.keyRelease(KeyEvent.VK_DOWN);
		        Thread.sleep(500);  
		        //PRESS ENTER AFTER SELECTING CORRECT FILE
		        rb.keyPress(KeyEvent.VK_ENTER);
		        rb.keyRelease(KeyEvent.VK_ENTER);
		        Thread.sleep(5000);

		        //PRESS CLOSE BUTTON
		        driver.findElement(By.xpath("//button[@id='attachment_closemodal']")).click();
		        Thread.sleep(5000);
	  
//	// Due to error add Student ID again
//		  
//		driver.findElement(By.xpath("//label[text()='Student ID']")).click();
//		driver.findElement(By.name("IO:97bb65ef876ba05053e97778cebb353c")).sendKeys("251383634");
		  
		  
		// Click on Save & Submit button on next page
		  
		  Thread.sleep(5000);
		  
		  driver.findElement(By.cssSelector("#next_page")).click();  
		  
		// Get ticket number
		  Thread.sleep(10000);
		  
		String str1= driver.findElement(By.xpath("//input[@id='sys_readonly.incident.number']")).getAttribute("value");
		System.out.println(str1);
	}
}

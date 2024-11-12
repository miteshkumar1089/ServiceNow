package selenium;

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

public class ServiceNow3_SendKeysAndScroll {
	
	@Test
	
	public void browser() throws InterruptedException {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//WebDriver driver= WebDriverManager.chromedriver().create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login ServiceNow
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.manage().window().maximize();
		
		//Launch Create Incident/Service Request page
		driver.get("https://nycdoedev2.service-now.com/com.glideapp.servicecatalog_cat_item_guide_view.do?v=1&sysparm_initial=true&sysparm_guide=1a602a171bfb2c10ec6254ea234bcbf6");

	// Fill requestor and press enter
	    WebElement requestor= driver.findElement(By.xpath("//div[@class='input-group']//*[contains(@ac_order_by,'name')]"));
	    requestor.sendKeys("Mkumar6");
	    requestor.sendKeys(Keys.ENTER);
	   	
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	    //scroll till 0,1000
//	    js.executeScript("window.scrollBy(0,1000)", "");
  
	    //scroll till element
	    
	    
	    
	    //scroll till bottom
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    
	    
	    
	    
//	   driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']")).click();
//	   boolean b= driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//child::input")).isSelected();
//		System.out.println(b);
	}
}

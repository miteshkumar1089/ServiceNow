package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ServiceNow2 {
	
	@Test
	
	public void browser() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//login ServiceNow
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		//Launch Create Incident/Service Request page
		driver.get("https://nycdoedev2.service-now.com/com.glideapp.servicecatalog_cat_item_guide_view.do?v=1&sysparm_initial=true&sysparm_guide=1a602a171bfb2c10ec6254ea234bcbf6");

	// Fill requires details in Order guide
	    driver.findElement(By.xpath("//div[@class='input-group']//*[contains(@ac_order_by,'name')]")).sendKeys("Mkumar6");
	   	
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
	    
	   driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']")).click();
	    
	    //driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//child::input")).click();
	    //driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//input")).click();
	   boolean b= driver.findElement(By.xpath("//label[text()='DOE Microsoft Teams Chat']//parent::span//child::input")).isSelected();
		System.out.println(b);
	}
}

package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTable {
	
	@Test
	
public void tables() throws InterruptedException {
		
		
		 WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		 //Launching the site.				
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");		
    driver.manage().window().maximize();		
            		
    List<WebElement> allHeaders=driver.findElements(By.xpath("//table[contains(@id,'cust')]//th"));

    System.out.println(allHeaders.size());

    //Assert.assertEquals(allHeaders.size(), 5,"Column count is not same");

    boolean status=false;

    for(WebElement ele:allHeaders)
    {

    String value=ele.getText();
    System.out.println(value);
    if(value.contains("Country"))
    {
       status=true;
       //break;
    }

    //Assert.assertTrue(status,"Header is not present");

     System.out.println("================");
    
    }
    
    List<WebElement> companyNames=driver.findElements(By.xpath("//table[contains(@id,'cust')]//tr//td[2]"));

    boolean companyStatus=false;

    for(WebElement ele:companyNames)
    {
    	String value=ele.getText();
        System.out.println(value);
     if(value.contains("Java"))
     {
       companyStatus=true;
       break;

     }
     }
    
    Assert.assertTrue(companyStatus, "Could not find company");

    driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();

    Thread.sleep(5000);

    driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[3]//a")).click();

    //driver.quit();
        
    }
	}

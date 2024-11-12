package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNGParameters {
	
	WebDriver driver;
	
	@Test(priority = 1) 
		public void driverSetup()
	{ 

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(); 
	} 
	
	@Test(priority = 2)
	 @Parameters({"author","searchKey"})
    public void testParameterWithXML( @Optional("Abc") String auth,String schKey) throws InterruptedException{
		
		driver.get("https://google.com");

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(schKey);

        System.out.println("Welcome ->"+auth+" Your search key is->"+schKey);
        System.out.println("Thread will sleep now");
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+schKey);
        //verifying the value in google search box
        Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(schKey));

	} 

	@Test(priority = 3)
	public void closeBrowser()
	{ 
	driver.close(); 
	
	}
	}
        


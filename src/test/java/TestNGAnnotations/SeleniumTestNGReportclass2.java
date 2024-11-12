package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTestNGReportclass2 {
	
	WebDriver driver;
	
	@Test(priority = 1) 
		public void driverSetup()
	{ 

	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(); 
	Reporter.log("The browser is opened");

	} 
	
	@Test(priority = 2) 
	public void getURL()
	{ 
	driver.get("https://www.google.com");
	// System.out.println("Launching Google site"); 
	Reporter.log("The Google Site is Launched");

	} 
	@Test(priority = 3) 
	public void getTitle()
	{ 
	String title = driver.getTitle(); 
	System.out.println(title); 
	Reporter.log("Prints the web page title");

	} 
	@Test(priority = 4) 
	public void closeBrowser()
	{ 
	driver.close(); 
	//System.out.println("Test successfully passed"); 
	Reporter.log("Close the driver");
	
	}
	}
        


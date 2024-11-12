package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

public class SeleniumTestNG4 {
	
	WebDriver driver;
	
	//Store current project workspace location in a string variable ‘path’
	//String path = System.getProperty("user.dir”);

	@BeforeTest
	public void SetDriver(){
	 
	//Mention the location of ChromeDriver in localsystem
	//System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	 
	}		

	@Test
	public void verifyTitle()
	{
		
	driver.get("https://www.amazon.com");
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Amazon.com.";
	Assert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println("Assert passed");
	System.out.println("Print when 1st assettion is passed");
	System.out.println("Print when 1st assettion is passed");
	}	

	@Test
	public void verifySoftAssertion()
	{
		
	driver.get("https://www.amazon.com");
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Cameras, books, watches, apparel, shoes and e-Gift Cards.";
	
	SoftAssert softassert = new SoftAssert();
	softassert.assertEquals(ActualTitle, ExpectedTitle);
	System.out.println("Assert passed");
	System.out.println("Print all time");
	System.out.println("Print all time and always");
	softassert.assertAll();
	}	

	@AfterTest
	public void closedriver()
	{
	 
	driver.close();
	 
	}
        
	}


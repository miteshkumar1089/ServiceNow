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

public class SeleniumTestNGReportclass {
	
	@Test
	public void testReport(){

	WebDriver driver=new FirefoxDriver();

	Reporter.log("Browser Opened");

	driver.manage().window().maximize();

	Reporter.log("Browser Maximized");

	driver.get("http://www.google.com");

	Reporter.log("Application started");

	driver.quit();

	Reporter.log("Application closed"); 
	}
	}
        


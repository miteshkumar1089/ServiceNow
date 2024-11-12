package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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

public class SeleniumTestNGreport {
	
	//To make it pass
	@Test
	public void passTest(){
	Assert.assertTrue(true);
	}

	//To make it fail
	@Test
	public void failTest(){
	Assert.assertTrue(false);
	}

	//To make it skip
	@Test
	public void skipTest(){
	throw new SkipException("Skipping -This method is skipped testing ");
	}
 
	}
        


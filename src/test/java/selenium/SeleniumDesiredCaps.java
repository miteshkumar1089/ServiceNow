package selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDesiredCaps {
	
	@Test
	
public void alert() throws InterruptedException {
		
		
//		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		
		 WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//it is used to define IE capability 
//		 DesiredCapabilities capabilities = DesiredCapabilities.chrome;
		  
//		capabilities.setCapability(CapabilityType.BROWSER_NAME, "CHROME");
//		capabilities.setCapability(ChromeDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		  
		 //it is used to initialize the IE driver
//		 WebDriver driver = new ChromeDriver(capabilities);
		  
		 driver.manage().window().maximize();

		 driver.get("http://gmail.com");
		  
		 driver.quit();	
        
}
	}

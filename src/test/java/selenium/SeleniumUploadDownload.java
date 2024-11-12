package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUploadDownload {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//WebDriver driver= WebDriverManager.chromedriver().create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String baseURL = "https://demo.guru99.com/test/upload/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\miteshkumar\\OneDrive - Nagarro\\Desktop\\VPN login issue.docx");
		
		Thread.sleep(10000);
		// check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();

        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
       		
	}
	

}

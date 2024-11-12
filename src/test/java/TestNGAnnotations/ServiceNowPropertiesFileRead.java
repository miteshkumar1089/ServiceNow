package TestNGAnnotations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowPropertiesFileRead {
	
	@Test
	
	public void browser() throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
		
		//login ServiceNow
		PropertiesFileHandler ps=new PropertiesFileHandler();
		String st= ps.readFromPropertiesFile("url");
		String usern= ps.readFromPropertiesFile("username");
		String pwd= ps.readFromPropertiesFile("password");
		
		//driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.get(st);
		driver.findElement(By.cssSelector("input.form-control")).sendKeys(usern);
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys(pwd);
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
	}
}

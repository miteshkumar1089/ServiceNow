package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWebDriverManager1 {
	
	@Test
	
	public void login() {
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		//WebDriver driver= WebDriverManager.chromedriver().create();
		WebDriver driver= WebDriverManager.chromedriver().capabilities(options).create();
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
//		driver.findElement(By.cssSelector("#mask_icon")).click();
//		driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.xpath("//a[text()='Login with SSO']//following-sibling::a")).click();
		String st= driver.findElement(By.xpath("//input[@id='midserver_status']//following::h1")).getText();
		System.out.println(st);
	}

}

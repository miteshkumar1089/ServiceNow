package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium_Xpath {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://nycdoedev2.service-now.com/login.do");

		//driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Mkumar6");
		driver.findElement(By.xpath("//input[@class='form-control' and @name='user_name']")).sendKeys("Mkumar6");
		//driver.findElement(By.xpath("//input[@type='password']//preceding::input[@type='text']")).sendKeys("Mkumar6");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Default@1234");
		driver.findElement(By.xpath("//button[contains(@aria-label, 'Password')]")).click();
		driver.findElement(By.xpath("//div[@class=\"login-card-footer sn-flexbox\"]//child::a[1]")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		//driver.findElement(By.xpath("//button[text()='Log in']")).click();
		//driver.findElement(By.className("btn-primary")).click();
		//driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		WebElement forgotPass= driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]"));
		//driver.findElement(By.xpath("//div[@class=\"login-card-footer sn-flexbox\"]//following::a[text()='Forgot Password ?']")).click();
		driver.findElement(By.xpath("//a[text()='Login with SSO']//following-sibling::a")).click();
		forgotPass.click();
		
		
		
	
	}
	

}

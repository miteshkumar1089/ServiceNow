package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumCssOthLocators {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(options);
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.navigate().to("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector("#mask_icon")).click();
		driver.findElement(By.className("btn-primary")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		//WebElement forgotPass= driver.findElement(By.linkText("Forgot Password ?"));
		//WebElement forgotPass1= driver.findElement(By.partialLinkText("Forgot"));
		//forgotPass.click();
		//forgotPass1.click();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
//		driver.quit();
		
		
	
	}
	

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumActionsMouseKeyboard {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		WebElement element;
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		
//		Actions action = new Actions(driver); 
//		element = driver.findElement(By.linkText("Get started free"));
//		action.moveToElement(element).click().build().perform();
		
	       Actions ac = new Actions(driver);

	       WebElement live= driver.findElement(By.xpath("(//div[@class='product-section__content-main']//a[@title='Live'])[1]"));    
	       ac.moveToElement(live).build().perform();
			
	}
	

}

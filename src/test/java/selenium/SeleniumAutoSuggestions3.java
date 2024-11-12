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

public class SeleniumAutoSuggestions3 {
	
	@Test
	
	public void browserLaunch() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//WebDriver driver= WebDriverManager.chromedriver().create();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String baseURL = "https://www.google.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
       List<WebElement> suggestions= driver.findElements(By.xpath("//ul//li[@class='sbct PZPZlf']//div[@class='wM6W7d']//span"));
       
       System.out.println(suggestions.size());
       
       for(WebElement ele: suggestions) {
    	   
    	   if (ele.getText().equalsIgnoreCase("Selenium python")) {
    		   
    		   ele.click();
    		   break;
    	   }
       }
//		
//		WebElement from= driver.findElement(By.xpath("//input[@placeholder='From']"));
//		Thread.sleep(4000);
//		from.sendKeys("Sydney");
//		Thread.sleep(4000);
//		from.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(4000);
//		from.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
//		Thread.sleep(4000);
		
			
	}
	

}

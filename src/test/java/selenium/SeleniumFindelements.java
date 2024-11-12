package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumFindelements {
	
	@Test
	
	public void multipleElements() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://flipkart.com/");
		List<WebElement> categories= driver.findElements(By.xpath("//span[@class='_1XjE3T']"));
		
		for(int i=0;i<categories.size();i++)
		{
//		String str= categories.get(i).getAttribute("class");
//		System.out.println(str);
		String st1= categories.get(i).getText();
		System.out.println(st1);
		
			if(st1.equalsIgnoreCase("Appliances"))
	{
			categories.get(i).click();
	}
			
    }	
		Thread.sleep(4000);
		driver.quit();
		
	}
}

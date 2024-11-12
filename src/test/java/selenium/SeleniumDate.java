package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDate {
	
	@Test
	
	public void date() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
			
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		new WebDriverWait(driver, Duration.ofSeconds(5))
		.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		String monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
	    System.out.println(monthYearVal);//February 2021
	    
		String month = monthYearVal.split(" ")[0].trim();
		String year = monthYearVal.split(" ")[1].trim();

		while(!(month.equals("June") && year.equals("2025"))) {
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		monthYearVal = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearVal);//February 2021
		month = monthYearVal.split(" ")[0].trim();
		year = monthYearVal.split(" ")[1].trim();

		}

		driver.findElement(By.xpath("//a[text()='23']")).click();

	   
	}
}

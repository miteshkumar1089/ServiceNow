package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ServiceNowALLJSExecutor {
	
	@Test
	
	public void browser() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://nycdoedev2.service-now.com/login.do");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Mkumar6");
		driver.findElement(By.cssSelector("input.form-control[type='password']")).sendKeys("Default@1234");
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		Thread.sleep(4000);
		driver.get("https://nycdoedev2.service-now.com/com.glideapp.servicecatalog_cat_item_guide_view.do?v=1&sysparm_initial=true&sysparm_guide=1a602a171bfb2c10ec6254ea234bcbf6");
	    driver.findElement(By.xpath("//div[@class='input-group']//*[contains(@ac_order_by,'name')]")).sendKeys("Mkumar6");
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
////		WebElement we= (WebElement) js.executeScript("return document.querySelector('[macroponent-namespace]').shadowRoot.querySelector('sn-polaris-layout').shadowRoot.querySelector('sn-polaris-header').shadowRoot.querySelector('.polaris-layout .starting-header-zone .sn-polaris-navigation.polaris-header-menu > div[aria-label=\"All\"]')");
////	   ((JavascriptExecutor)driver).executeScript("arguments[0].click()",we);
//	   
//	  // JavascriptExecutor js1 = (JavascriptExecutor)driver;
//	    WebElement we1= (WebElement) js.executeScript("return document.querySelector('[macroponent-namespace]').shadowRoot.querySelector('sn-polaris-layout').shadowRoot.querySelector('sn-polaris-header').shadowRoot.querySelector('sn-polaris-menu').shadowRoot.querySelector('sn-collapsible-list').shadowRoot.querySelector('div').querySelector('div>ul').querySelector('li:nth-child(4)').querySelector(‘.item-icon').querySelector('span')");
//	   js.executeScript("arguments[0].click()",we1);
////		driver.quit();
		
	}
}

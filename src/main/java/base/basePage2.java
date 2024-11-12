package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;

import Utilities.DataFactory;
import Utilities.ReadingPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basePage2  {
	
	public static WebDriver driver;
	ReadingPropertiesFile propObj= new ReadingPropertiesFile();

    public static DataFactory data= new DataFactory();
		
//	public static ExtentReports extent;
//	public static ExtentTest test;
	
 @BeforeMethod
  public void setUp() throws IOException {
	 
	 String browser = propObj.readFromPropertiesFile("browser");
	 
	 if(browser.equals("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			//options.setHeadless(false);
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		}
		else if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			// Setting  options to false so it will run without headless mode
			// If we make it true then it will run the test code in headless mode
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			//options.setHeadless(false);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
	 
	// extent = ExtentManager.getInstance("reports//Extent_demo.html");
	 
	   	 
		driver.get(propObj.readFromPropertiesFile("url"));
 }

}

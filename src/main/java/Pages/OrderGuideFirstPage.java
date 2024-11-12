package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderGuideFirstPage {

	WebDriver driver;
	WebDriverWait wait;

	public static By issueDetails = By.xpath("//a[text()='Issue Details']");
	public static By requestor = By.xpath("//div[@class='input-group']//*[contains(@ac_order_by,'name')]");
	public static By multiLanguage = By.xpath("//select[@name='IO:ca3b4e401b44fc10ec6254ea234bcbdf']");
	public static By language = By.xpath("//select[@name='IO:e24d02c01b44fc10ec6254ea234bcbd7']");
	public static By source = By.name("IO:0170a0b21bdabc10ec6254ea234bcba8");
	public static By reportingForStudent = By.xpath("//label[text()='Reporting for Student']");
	public static By student = By.xpath("//label[text()='Student ID']");
	public static By studentID = By.name("IO:97bb65ef876ba05053e97778cebb353c");
	public static By studentSearchButton = By.xpath("//button[contains(text(),'Search')]");
	public static By searchPopupClose = By.xpath("//table[@class='drag_section_header']//tbody//span");
	public static By siteSelection = By.xpath("(//div[@class='input-group']//child::input)[5]");
	public static By description = By.xpath("//div//textarea[@aria-required='true']");
	public static By catalog = By.xpath("(//div[@class='input-group']//child::input)[11]");
	public static By serviceGrp = By.xpath("(//div[@class='input-group']//child::input)[11]");
	public static By category = By.xpath("(//div[@class='input-group']//child::input)[12]");
	public static By nextButton = By.cssSelector("#next_page_footer");

	// Find attribute and css value of Issue details option
	
	public OrderGuideFirstPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds((10)));
        
	}

	public String issueDetailsCSSValue() {

		String cssV = driver.findElement(issueDetails).getCssValue("background-color");

		return cssV;

	}

	public String issueDetailsAttributeValue() {

		String cssV1 = driver.findElement(issueDetails).getAttribute("aria-hidden");

		return cssV1;
	}

	// Add Requestor

	public void getRequestor(String user) {

		driver.findElement(requestor).sendKeys(user);
		driver.findElement(requestor).sendKeys(Keys.ENTER);

	}

	// Add Multilingual Support Required

	public void getMultilingual(String langChoice, String preferredLangChoice) throws InterruptedException {

		Thread.sleep(2000);
		WebElement drpDwn = driver.findElement(multiLanguage);
		Thread.sleep(2000);
		Select options = new Select(drpDwn);
		Thread.sleep(2000);
		options.selectByValue(langChoice);

		if (langChoice.equalsIgnoreCase("yes")) {
			WebElement drpDwn1 = driver.findElement(language);
			Select op2 = new Select(drpDwn1);
			op2.selectByVisibleText(preferredLangChoice);
		}

		else {
			System.out.println("Dropdown is set to No or not selected");
		}
	}

	// Select source
	public void getSource(String sourceChoice) {
		Select selectSource = new Select(driver.findElement(source));
		selectSource.selectByVisibleText(sourceChoice);
	}

	// Selecting Reported for
	public void getReportedFor(String studentUserId) throws InterruptedException {
		driver.findElement(reportingForStudent).click();
		Thread.sleep(5000);
		driver.findElement(student).click();
		driver.findElement(studentID).sendKeys(studentUserId);
		driver.findElement(studentSearchButton).click();
		driver.findElement(searchPopupClose).click();
	}

	// Site selection
	public void getSite(String siteID) throws InterruptedException {

		Thread.sleep(2000);
		WebElement site = driver.findElement(siteSelection);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", site);

		site.sendKeys(siteID);
		site.sendKeys(Keys.ARROW_DOWN);
		site.sendKeys(Keys.ENTER);
	}

	// Description
	public void addDescription(String text) {
		driver.findElement(description).sendKeys(text);
	}

	// Catalog item
	public void getCatalog(String getGatalogItem) {
		
		WebElement addcatalog = driver.findElement(catalog);
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].scrollIntoView(true);", addcatalog);
		addcatalog.sendKeys(getGatalogItem);
		addcatalog.sendKeys(Keys.ARROW_DOWN);
		addcatalog.sendKeys(Keys.ENTER);
		
//		WebElement addServiceGroup = driver.findElement(serviceGrp);
//		JavascriptExecutor executor2 = (JavascriptExecutor) driver;
//		executor2.executeScript("arguments[0].scrollIntoView(true);", addServiceGroup);
//		addServiceGroup.clear();
//		addServiceGroup.sendKeys(getServiceGroup);
//		addServiceGroup.sendKeys(Keys.ARROW_DOWN);
//		addServiceGroup.sendKeys(Keys.ENTER);
//
//		WebElement addCategory = driver.findElement(category);
//		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
//		executor3.executeScript("arguments[0].scrollIntoView(true);", addCategory);
//		addCategory.clear();
//		addCategory.sendKeys(getCategory);
//		addCategory.sendKeys(Keys.ARROW_DOWN);
//		addCategory.sendKeys(Keys.ENTER);

	}

	// Click on Next button

	public void clickNextButton() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.findElement(nextButton).click();
	}
}

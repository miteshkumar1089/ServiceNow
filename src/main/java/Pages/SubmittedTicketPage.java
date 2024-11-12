package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmittedTicketPage {

	WebDriver driver;
	WebDriverWait wait;

	public static By tikcetID = By.xpath("//input[@id='sys_readonly.incident.number']");

	public SubmittedTicketPage(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds((10)));

	}

	public String getTicketNumber() {

		String str1 = driver.findElement(tikcetID).getAttribute("value");
		return str1;

	}
}

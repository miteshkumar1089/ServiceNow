package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.OrderGuideNextPage;
import Pages.SubmittedTicketPage;
import base.basePage;

public class submittedTicketPage extends basePage{	
	
	
	SubmittedTicketPage ticketPage;
	orderGuideNextPage ogNextPage;
	
	// @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
	
	@DataProvider(name = "CatalogProvider")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] { { "Access to a public folder"}, { "Report a Stolen Device"}, { "Access to Network"} };
	}
	@Test(dataProvider = "CatalogProvider")
	public void validatingUserIsAbleToFillDetailsAndSubmitInOrderGuideNextPage(String catalogSearch) throws IOException, InterruptedException {
		
		ticketPage= new SubmittedTicketPage(driver);
		ogNextPage=new orderGuideNextPage();
		ogNextPage.validatingUserIsAbleToFillDetailsAndSubmitInOrderGuideNextPage(catalogSearch);
		
		String ticketNumber= ticketPage.getTicketNumber();
		System.out.println(ticketNumber);
	}
	

}


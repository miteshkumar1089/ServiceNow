package TestNGAnnotations;

import org.testng.annotations.Test;

public class SeleniumTestNG3 {
	
	 @Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("User has signed in successfully");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("The browser is opened");
	  }

	  @Test (dependsOnMethods = { "SignIn" })
	  public void LogOut() {
		  System.out.println("The user logged out successfully");	
        
	}

}

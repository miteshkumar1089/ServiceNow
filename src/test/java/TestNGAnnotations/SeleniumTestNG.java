package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestNG {

	@BeforeSuite
	public void verifyBeforeSuite() {
		System.out.println("Executing Befor Suite method");
	}

	@BeforeTest
	public void verifyBeforeTest() {
		System.out.println("Executing Befor Test method");
	}

	@BeforeClass
	public void verifyBeforeClasses() {
		System.out.println("Executing Befor Classes method");
	}

	@BeforeMethod
	public void verifyBeforeMethod() {
		System.out.println("Executing Befor Method");
	}

	@Test(priority=0)
	public void verifyTest1() {
		System.out.println("Executing Test method1");
	}
	
	@Test(priority=1, groups= {"bonding"})
	public void verifyTest2() {
		System.out.println("Executing Test method2");
	}
	
	@Test(priority=2)
	public void verifyTest3() {
		System.out.println("Executing Test method3");
	}

	@AfterMethod
	public void verifyAfterMethod() {
		System.out.println("Executing After Method");
	}

	@AfterClass
	public void verifyAfterClassMethod() {
		System.out.println("Executing After Class method");
	}

	@AfterTest
	public void verifyAfterTestMethod() {
		System.out.println("Executing After Test method");
	}
	
	@AfterSuite
	public void verifySuiteMethod() {
		System.out.println("Executing After Suite method");	
	}

}
//@BeforeSuite
//@BeforeTest
//@BeforeClass
//@BeforeMethod
//@Test
//@AfterMethod
//@AfterClass
//@AfterTest
//@AfterSuite

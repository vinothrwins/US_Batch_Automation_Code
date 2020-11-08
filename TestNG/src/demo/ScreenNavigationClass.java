package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class ScreenNavigationClass {

	@BeforeClass
	public void launchApplication() {
		  System.out.println("Application is launched");
	}
	
	@AfterClass
	public void closeApplication() {
		  System.out.println("Application is Closed");
	}
	
	@Test(priority=1)
	public void navigateRequestDemoPage() {
		System.out.println("Register Demo Page is displayed");
	}
	
	@Test(priority=2)
	public void navigatePythonDataScience() {
		System.out.println("Python for Data Science Page is displayed");
	}
	
	@Test(priority=3)
	public void navigateTechTalk() {
		System.out.println("Tech Talk Page is displayed");
	}
	
	
	

}

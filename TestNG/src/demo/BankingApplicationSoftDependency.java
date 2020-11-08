package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplicationSoftDependency {
	
	  @Test
	  public void launchApplication() {
			  System.out.println("Application is launched");
			  Assert.assertEquals("Page Title", "Page Title");
	  }
	  
	  @Test(dependsOnMethods = {"launchApplication"})
	  public void checkSavingAccountBalance() {
			  System.out.println("Saving Account Balance is Displayed");
			  Assert.assertEquals("Saving Account Balance", "Not Saving Account Balance");
	  }
	  
	  @Test(dependsOnMethods = {"checkSavingAccountBalance"})
	  public void checkCurrentAccountBalance() {
			  System.out.println("Current Account Balance is Displayed");
			  Assert.assertEquals("Saving Account Balance", "Saving Account Balance");
	  }
	  	  
	  @Test(dependsOnMethods = {"checkCurrentAccountBalance"},alwaysRun=true)
	  public void closeApplication() {
		  System.out.println("Application is Closed");
		  Assert.assertEquals("Closed", "Closed");
	  }
		  
	  
}

package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankingApplicationAssertValidation {
	
  @Test(priority = 1)
  public void launchApplication() {
		  System.out.println("Application is launched");
		  Assert.assertEquals("Page Title", "Not Page Title");
  }
  
  @Test(priority = 2)
  public void checkSavingAccountBalance() {
		  System.out.println("Saving Account Balance is Displayed");
		  Assert.assertEquals("Saving Account Balance", "Saving Account Balance");
  }
  
  @Test(priority = 3,enabled=false)
  public void checkCurrentAccountBalance() {
		  System.out.println("Current Account Balance is Displayed");
		  Assert.assertEquals("Saving Account Balance", "Saving Account Balance");
  }
  	  
  @Test(priority = 4)
  public void closeApplication() {
	  System.out.println("Application is Closed");
	  Assert.assertEquals("Closed", "Closed");
  }
	  
}

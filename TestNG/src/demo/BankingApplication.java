package demo;

import org.testng.annotations.Test;

public class BankingApplication {
	
  @Test(priority = 1)
  public void launchApplication() {
		  System.out.println("Application is launched");
  }
  
  @Test(priority = 2,enabled=false)
  public void checkSavingAccountBalance() {
		  System.out.println("Saving Account Balance is Displayed");
  }
  
  @Test(priority = 3,enabled=false)
  public void checkCurrentAccountBalance() {
		  System.out.println("Current Account Balance is Displayed");
  }
  	  
  @Test(priority = 4)
  public void closeApplication() {
	  System.out.println("Application is Closed");
  }
	  
}

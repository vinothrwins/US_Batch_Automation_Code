package demo;

import org.testng.annotations.Test;

public class RegisterDemo {
	
  @Test(priority=1)
  public void launchApplication() {
		  System.out.println("Application is launched");
  }
  
  @Test(priority=2)
  public void navigateToRegisterDemo() {
	  System.out.println("Navigated to Register Demo Page");
  }

  
  @Test(priority=3)
  public void registerDemo() {
	  System.out.println("User is Registered");
  }
  
  @Test(priority=4)
  public void closeApplication() {
	  System.out.println("Application is Closed");
  }
  
}

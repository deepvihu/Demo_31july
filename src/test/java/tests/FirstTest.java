package tests;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Test (groups="SwagLab")
public class FirstTest {
	
	@BeforeSuite
	public void bsuite()
	{
	System.out.println("BeforeSuite method started");
	}

	
	
  @Test (priority=0 , groups="regression", timeOut=1000)
  public void log() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("Log");
  }
  
  @Test (priority=1)
  public void search() {
	 //System.out.println("Thread Id :" +Thread.currentThread().getId());
	  System.out.println("Search");
  }
  
  @Test (priority=2 , groups={"regression" , "sanity"})
  public void addcart() {
	  System.out.println("AddCart");
	  Assert.assertTrue(false);
  }
  
  @Test (priority=3 , groups="load")
  public void checkout() {
	  System.out.println("Checkout");
  }
  @AfterSuite
	public void asuite()
	{
	System.out.println("AfterSuite method started");
	}
}

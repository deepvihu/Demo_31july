package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SecondTest {
	WebDriver driver;
	
	@BeforeSuite
	public void bsuite()
	{
	System.out.println("BeforeSuite method started");
	}

	
	
 @BeforeTest
  public void initializeBrowser() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
  }
  @Test (priority=0)
  public void testLogin() throws InterruptedException
  {
	 // Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
	  driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
	  driver.findElement(By.xpath("//input[@id='login-butt']")).click();
  }
  
  @Test (priority=1)
  public void test()
  {
	  System.out.println("test method");
  }
  
  @AfterTest
  public void teardown()
  {
	  System.out.println("Logout");
  }
  @AfterSuite
 	public void asuite()
 	{
 	System.out.println("AfterSuite method started");
 	}
  
}

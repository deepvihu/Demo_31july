package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basetest {
	WebDriver driver;
	 @BeforeTest
	  public void initializeBrowser() {
		  System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
	  }
	
	 @AfterTest
	  public void teardown()
	  {
		  System.out.println("Logout");
		  driver.close();
	  }
}

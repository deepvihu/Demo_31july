package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactory.LoginPageFac;
import Pages.LoginPage;

public class SwagVerifylog {
  WebDriver driver;
  LoginPageFac log;
  
	
	@Test
	public void verifyLog()
	{
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		// without constructor
//		LoginPageFac logfac = PageFactory.initElements(driver, LoginPageFac.class);
//		logfac.swaglog();
		
		
		// with constructor
		log=new LoginPageFac(driver);
		log.swaglog();
		
	}
}

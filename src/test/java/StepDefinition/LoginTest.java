package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest {
	WebDriver driver=null;
	LoginPage log;
	
	@Test
	public void verifylog()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
			 driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
				
			log= new LoginPage(driver);
		//	log.typelog("name", "secret_sauce");
			
			log.typeuser("standard_user");
			log.typepass("secret_sauce");
			log.clickbtn();
			driver.close();
	}
	
	
	
}

package com.swag.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage log;
	
	@Test
	public void verifylog()
	{
		
		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\deedhole\\eclipse-workspace\\SwagDemo\\‪Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
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

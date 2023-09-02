package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
  public void initBrowser(String browser) {
		if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("Webdriver.edge.driver","‪C:\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		driver.get("https://www.google.com/");
  }
	
	@Test
	public void image()
	{
		System.out.println("thread ID: " +Thread.currentThread().getId());
		driver.findElement(By.linkText("Images")).click();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}

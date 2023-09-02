package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SwagDemo {
	WebDriver driver;
 
	@BeforeTest
  public void initalizebrowser() {
	  System.out.println("beforeTest");
	  System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	
  }

  @Test (expectedExceptions= NoSuchElementException.class)
  public void TestLogin() {
	
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();	
	}
  

  @AfterTest
  public void teardown() {
	  System.out.println("afterTest");
	  driver.close();
  }

}

package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleTest {
	WebDriver driver;
	
  @Test (priority=-1)
  public void init() {
	  System.out.println("beforeTest");
	  System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
  }
  
  @Test (priority=0 )
  @Parameters({"username" , "password"})
  public void log(@Optional("problem_user") String username , String password)
  {
	  driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

  }
  @Test (priority=1 )
  public void search()
  {
	  System.out.println("search method");
  }
  
 
  
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("before method");
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("After method");
//  }
//
//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("before class");
//  }
//
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("After class");
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("before test");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("After test");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("before Suite");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("After suite");
//  }

}

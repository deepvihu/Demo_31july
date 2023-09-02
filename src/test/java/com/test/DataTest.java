package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
  @Test (dataProvider = "loginData")
  public void Test(String user , String pass) throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	  ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	  System.out.println("thread ID: " +Thread.currentThread().getId());
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	   driver.close();  
  }
  
  @DataProvider (parallel=true)
  public Object[][] loginData()
  {
	  Object[][] data= new Object[4][2];
	  data[0][0] = "standard_user";
	  data[0][1] = "secret_sauce";
	  
	  data[1][0] = "problem_user";
	  data[1][1] = "secret_sauce";
	  
	  data[2][0] = "standard_user";
	  data[2][1] = "secret_sauce";
	  
	  data[3][0] = "problem_user";
	  data[3][1] = "secret_sauce";
	  return data;
  }
}

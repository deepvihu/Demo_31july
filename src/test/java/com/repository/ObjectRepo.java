package com.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObjectRepo {

	@Test
	public void TestOR() throws IOException
	{
		File src= new File("./src/test/java/com/repository/Object-swagRepo.properties");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
	
		System.out.println("property file loaded");
		
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath(pro.getProperty("swag.login.username.xpath"))).
		sendKeys("standard_user");
		
		driver.findElement(By.xpath(pro.getProperty("swag.login.password.xpath"))).
		sendKeys("secret_sauce");
		
		driver.findElement(By.xpath(pro.getProperty("swag.login.logbtn.xpath"))).click();
		
		
	}
	
}

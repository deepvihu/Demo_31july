package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTestNG {
	@Test
	public void FirstMethod()
	{
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	String expectedTitle="Goolge";
	String actualTitle= driver.getTitle();
	Assert.assertEquals(actualTitle,expectedTitle);
	
	String expUrl="www.goole.com";
	String actUrl= driver.getCurrentUrl();
	Assert.assertEquals(actUrl, expUrl);
	}}


//String expectedTitle="Goolge";
//String actualTitle= driver.getTitle();
//Assert.assertEquals(actualTitle,expectedTitle);
//
//String expUrl="www.goole.com";
//String actUrl= driver.getCurrentUrl();
//Assert.assertEquals(actUrl, expUrl);


//String expectedTitle="Goolge";
//String actualTitle= driver.getTitle();
////Assert.assertEquals(actualTitle,expectedTitle);
//SoftAssert softAssert= new SoftAssert();
//softAssert.assertEquals(actualTitle, expectedTitle, "Title Mismatched");
//
//String expUrl="https://www.google.com/";
//String actUrl= driver.getCurrentUrl();
////Assert.assertEquals(actUrl, expUrl);
//softAssert.assertEquals(actUrl, expUrl, "Invalid URL");
//softAssert.assertAll();
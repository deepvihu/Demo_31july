package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest2 {

	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	String title = driver.getTitle();
	System.out.println("the title is :"+title);
	
	System.out.println(driver.getCurrentUrl());
	
	WebElement a= driver.findElement(By.id("user-name"));
	System.out.println(a.getAttribute("class"));
	System.out.println(a.getTagName());
	System.out.println(a.getCssValue("width"));
	
	String t= driver.findElement(By.xpath("//div[@class='login_password']/h4")).getText();
	System.out.println(t);

	driver.close();
		
		
	}
}

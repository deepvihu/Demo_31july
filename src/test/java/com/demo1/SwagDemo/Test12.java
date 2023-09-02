package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test12 {
	public static void main(String args[]) throws InterruptedException
	{
		 System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		  ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://webapps.tekstac.com/Shopify/");
		driver.manage().window().maximize();
		
		WebElement a= driver.findElement(By.name("usrnm"));
		System.out.println(a.getAttribute("placeholder"));
		
	}
}

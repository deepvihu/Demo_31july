package com.demo1.SwagDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Setting the driver path
		System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		// initializing the driver
		WebDriver driver = new ChromeDriver();
		
		//navigate to app
		driver.get("https://www.saucedemo.com/");
		
		// maximize the window
		driver.manage().window().maximize();
		
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		
//	WebElement a=driver.findElement(By.name("password"));
//	a.sendKeys("secret_sauce");
//
//	driver.findElement(By.id("login-button")).submit();
		
	 List<WebElement> n = driver.findElements(By.tagName("input"));
	 System.out.println(n.size());
	 	
	 for(int i=0 ;i<n.size(); i++)
	 {
	 	String txt = n.get(i).getText();
	 	System.out.println(txt);
	 //	System.out.println(n.get(i).getAttribute("value"));
	 }
		
		//closing the driver
		//driver.close();
		
			
	}

}

package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {


	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.xpath("//*[@id='user-name']"));
		a.sendKeys("standard_user");
	
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//Thread.sleep(1000);
		WebElement b= driver.findElement(By.id("login-button"));
		b.click();
}
}

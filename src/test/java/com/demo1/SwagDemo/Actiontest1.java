package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiontest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement unm= driver.findElement(By.xpath("//input[@id='user-name']"));
		unm.sendKeys("standard_user");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).build().perform();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
		
		

		
		
		
		
	}

}

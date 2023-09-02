package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionapp2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	Actions act = new Actions(driver);
	
	WebElement unm=driver.findElement(By.xpath("//*[@id='user-name']"));
	WebElement pwd=driver.findElement(By.name("password"));
	WebElement log= driver.findElement(By.id("login-button"));
	
	unm.click();
	act.moveToElement(unm).sendKeys("standard_user").build().perform();
	pwd.click();
	act.moveToElement(pwd).sendKeys("secret_sauce").build().perform();
	act.moveToElement(log).click().build().perform();
}
}

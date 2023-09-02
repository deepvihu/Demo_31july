package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionapp3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement a= driver.findElement(By.xpath("//a[@href='http://register.rediff.com/register/register.php?FormName=user_details']"));
		
		act.moveToElement(a).click().build().perform();
		act.click(a).build().perform();
		
		act.doubleClick(a).build().perform();
		
		act.contextClick(a).build().perform();
		
}
}

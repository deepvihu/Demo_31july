package com.demo1.SwagDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest3 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		List<WebElement> name = driver.findElements(By.cssSelector("select[name=DOB_Dayb09e6ec7]"));
		System.out.println("no. of elements:" +name.size());
		
		
		
		
		
		driver.close();
}
}

package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertapp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
		
		//  get the text of error msg
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		
		Thread.sleep(1000);
		// handle the error msg
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		
		
	}

}

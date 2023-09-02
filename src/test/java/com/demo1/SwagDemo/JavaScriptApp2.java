package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptApp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement unm=driver.findElement(By.id("user-name"));
		js.executeScript("arguments[0].setAttribute('value','standard_user');",unm);
		Thread.sleep(1000);
		Object obj= js.executeScript("return arguments[0].getAttribute('value');",unm);
		String s1 =(String)obj;
		System.out.println(s1);
		Thread.sleep(1000);
		
		WebElement pwd=driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','secret_sauce');",pwd);
		Thread.sleep(1000);
	js.executeScript("return arguments[0].getAttribute('value');",pwd);
//		String s2 =(String)obj1;
//		System.out.println(s2);
//		Thread.sleep(3000);
		
		WebElement logbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
		js.executeScript("arguments[0].click();", logbtn);
		
		
	}

}

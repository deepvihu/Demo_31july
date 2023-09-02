package com.demo1.SwagDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptApp1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("location.reload()");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollBy(400,600)");
	}

}

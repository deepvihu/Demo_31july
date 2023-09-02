package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameapp {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/support/pagefactory/AbstractAnnotations.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.switchTo().frame(2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/support/pagefactory/AbstractAnnotations.html']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.switchTo().frame("classFrame");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-summary.html']")).click();
		
		driver.switchTo().frame(1);
		driver.findElement(By.tagName("iframe")).getSize();
		
		driver.switchTo().parentFrame();
		
		
}
}
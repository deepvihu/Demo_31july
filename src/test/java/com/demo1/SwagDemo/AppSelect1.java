package com.demo1.SwagDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppSelect1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.id("cars"));
		
		Select s = new Select(a);		
 
		List<WebElement> opt =s.getOptions();
		for(WebElement v: opt)
		{
			String text=v.getText();
			System.out.println(text);
		}
	
		s.selectByIndex(0);
		System.out.println("First Selected");
		WebElement e=s.getFirstSelectedOption();
		String first=e.getAttribute("value");
		System.out.println(first);

		List<WebElement> all= s.getAllSelectedOptions();
		System.out.println(all.size());
	}

}

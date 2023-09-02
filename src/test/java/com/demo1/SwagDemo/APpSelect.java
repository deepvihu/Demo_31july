package com.demo1.SwagDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class APpSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement a=driver.findElement(By.id("cars"));
		
		Select s = new Select(a);		

		boolean b= s.isMultiple();
		System.out.println(b);
		
		s.selectByIndex(0);
		s.selectByValue("audi");
		s.selectByVisibleText("Opel");
		Thread.sleep(1000);
		
		WebElement e=s.getFirstSelectedOption();
		String first=e.getAttribute("value");
		System.out.println(first);
		
		//s.deselectByIndex(0);
		s.deselectAll();
		
		List<WebElement> all= s.getAllSelectedOptions();
		System.out.println(all.size());
		
		
		//s.deselectAll();
//		s.deselectByIndex(0);
//		s.deselectByValue("audi");
//		s.deselectByVisibleText("Opel");
//		
		
		
	}

}

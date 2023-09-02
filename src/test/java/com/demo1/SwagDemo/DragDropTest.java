package com.demo1.SwagDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.id("draggable"));
		
		WebElement dst= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(src, dst).perform();
		
		if(dst.getText().matches("Dropped!"))
		{
			System.out.println("successful");
		}
		
	}

}

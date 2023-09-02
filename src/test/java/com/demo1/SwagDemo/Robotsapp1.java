package com.demo1.SwagDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotsapp1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	
		driver.manage().window().maximize();
		
		Robot r= new Robot();
		Thread.sleep(4000);

         r.keyPress(KeyEvent.VK_DOWN);  	
         
    	 WebElement a=driver.findElement(By.xpath("//input[@id='user-name']"));
			a.sendKeys("standard_user");
			
	//select the User name
			r.keyPress(KeyEvent.VK_CONTROL);	
	        r.keyPress(KeyEvent.VK_A); 
	        
	        r.keyRelease(KeyEvent.VK_CONTROL);	
		    r.keyRelease(KeyEvent.VK_A);
			
	//  copy the User name
			r.keyPress(KeyEvent.VK_CONTROL);	
	        r.keyPress(KeyEvent.VK_C);
	        
	        r.keyRelease(KeyEvent.VK_CONTROL);	
		    r.keyRelease(KeyEvent.VK_C);
		        Thread.sleep(2000);
		        
    // go to next field
		        r.keyPress(KeyEvent.VK_TAB);	
		        r.keyRelease(KeyEvent.VK_TAB);
		         Thread.sleep(2000);
		       
	 // paste the username in pwd
		        r.keyPress(KeyEvent.VK_CONTROL);	
		        r.keyPress(KeyEvent.VK_V); 
		        
		        r.keyRelease(KeyEvent.VK_CONTROL);	
			    r.keyRelease(KeyEvent.VK_V);    
	 // login 
			    r.keyPress(KeyEvent.VK_TAB);	
		         Thread.sleep(2000); 
		         
		         r.keyPress(KeyEvent.VK_ENTER);	
		         Thread.sleep(2000);
		

		
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(4000);
//		
//		r.keyPress(KeyEvent.VK_TAB); // user name
//		Thread.sleep(4000);
//		r.keyPress(KeyEvent.VK_TAB);  // pwd
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_TAB);  // login
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);  // enter login
		
		
	}

}

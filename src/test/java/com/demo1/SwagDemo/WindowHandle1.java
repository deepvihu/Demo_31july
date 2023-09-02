package com.demo1.SwagDemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/property-for-sale-rent-in-Mumbai/residential-real-estate-Mumbai?mbtracker=google_paid_brand_1_desk_mumbai&ccode=brand_1_sem&gclid=EAIaIQobChMInNzfu46I_QIVSBwrCh0JCw_QEAAYASAAEgIcuPD_BwE");
		driver.manage().window().maximize();
		
		String parenthandle= driver.getWindowHandle();
		System.out.println("parent window - "+parenthandle);
		
		driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[1]/div/div[2]/div[3]/a")).click();

		Set<String> handle= driver.getWindowHandles();
		for(String a: handle)
		{
			System.out.println(a);
		}
		
		Thread.sleep(1000);
		driver.switchTo().window(parenthandle);
		
		
		
		
		
		

//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		
	}

}

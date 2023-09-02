package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class Action2Test  {
	WebDriver driver;
@Test
	public void verify() throws IOException
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
		
		 driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		  driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//input[@id='login-butt']")).click();	
	}
@AfterMethod
public void teardown(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		Utils.CaptureScreen(driver,result.getName());
	}
	driver.quit();
}
}



package com.demo1.SwagDemo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(a).perform();
		//Thread.sleep(2000);
	
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Fluent Wait")
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://www.ebay.com/b/Apple/bn_21819543ddd']")))
		.click();
		
		
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(4));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.ebay.com/b/Apple/bn_21819543']")))
//		.click();
		
		//driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Apple/bn_21819543']")).click();
		
		
	}

}

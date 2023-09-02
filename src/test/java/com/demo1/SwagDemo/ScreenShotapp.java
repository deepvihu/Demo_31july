package com.demo1.SwagDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotapp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		Utils.CaptureShots(driver, "logPage");
		driver.findElement(By.id("login-button")).click();
		Utils.CaptureShots(driver, "logerror");

	}

}

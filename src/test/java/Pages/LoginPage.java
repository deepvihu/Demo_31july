package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver=null;
	
	
	By username= By.xpath("//input[@id='user-name']");
	By password= By.id("password");
	By logbtn= By.xpath("//input[@id='login-button']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typelog(String uid , String pwd)
	{
		driver.findElement(username).sendKeys(uid);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(logbtn).click();
	}

	public void typeuser(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typepass(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickbtn()
	{
		driver.findElement(logbtn).click();
	}
	
	
}

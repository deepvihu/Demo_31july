package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFac {

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='user-name']")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.ID,using="password")
	@CacheLookup
	WebElement password;
	
//	@FindBys({
//		@FindBy(xpath="//input[@id='login-button']"), // match
//		@FindBy(id="login-button"),  // match
//	})
//	WebElement Logbtn;
	
	@FindAll({
		@FindBy(xpath="//input[@id='login-button']"),// not
		@FindBy(id="login-button"),  // match
		@FindBy(name="login-button")	
	})
	@CacheLookup
	WebElement logbtn;
	
	public LoginPageFac(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void swaglog()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		logbtn.click();
	}
	
	public void swaglog1(String uid , String pwd)
	{
		username.sendKeys(uid);
		password.sendKeys(pwd);
		logbtn.click();
	}
	
	
	
	
}

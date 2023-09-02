package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demo1.DemoSwagLabs.ScreenTest;
import com.demo1.DemoSwagLabs.Utils;

import Base.BaseScreen;

public class Listenerstest extends BaseScreen implements ITestListener{
	static WebDriver driver;
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String testname = result.getName();
		System.out.println(testname+"test case failed -- screenshot captured");
		
	
	try {
		CaptureScreen(driver,testname);}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}			
	

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("test case failed");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("test case failed by timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("test case started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test case finished");
	}


	

	
	
	}

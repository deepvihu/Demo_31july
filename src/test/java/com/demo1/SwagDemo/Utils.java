package com.demo1.SwagDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static void CaptureShots(WebDriver driver , String filename) throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File file =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./ScreenShots/"+filename+".png"));
		
	}

}

package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils  {
	WebDriver driver =null;

	public static void CaptureScreen(WebDriver driver, String filename) throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot ts= (TakesScreenshot)driver;
		File scr= ts.getScreenshotAs(OutputType.FILE);
		FileUtils .copyFile(scr, new File("./Screenshots/"+filename+".png"));
		
	}

}

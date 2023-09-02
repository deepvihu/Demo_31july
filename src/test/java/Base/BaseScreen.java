package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class BaseScreen extends Basetest {
	
	public static void CaptureScreen(WebDriver driver, String testname) throws IOException {
		// TODO Auto-generated method stub
		File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filename = System.getProperty("user.dir")+"\\Screenshots1\\"+testname+".png";
		FileUtils .copyFile(scr, new File(filename));
		
	}

}

package genericMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BasePP.BaseCCC;

public class GenericMethods {
	
	public static String takeScreen() throws IOException {
		
		String screenShotPath = "";
		TakesScreenshot srcshot = (TakesScreenshot) BaseCCC.driver;
		File sourceFile = srcshot.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File("D://Eclipse//Screenshorts//"+"ScreenCapture"+ System.currentTimeMillis()+ ".png");
		FileUtils.copyFile(sourceFile, destinationPath);
		screenShotPath = destinationPath.getAbsolutePath();
		return screenShotPath;
		
	}

}

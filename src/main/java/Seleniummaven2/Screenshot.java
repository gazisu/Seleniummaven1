package Seleniummaven2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class Screenshot extends driversetup {

	@Test
	
	
	void screenshotTest() {
		driver.get("http://google.com/");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotFile, new File(.//Screenshot//));
		
	}
}

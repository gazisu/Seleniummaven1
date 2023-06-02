package Seleniummaven2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driversetup {
	protected WebDriver driver;
	
	@BeforeMethod
	
	void setup(){
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		
	}
	
//	@AfterMethod
//	
//	void closing() {
//		
//		driver.close();
//		driver.quit();
//	}
//	
	
	
	
	

}

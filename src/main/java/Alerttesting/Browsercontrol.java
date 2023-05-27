package Alerttesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsercontrol {
	protected WebDriver driver;
	
	@BeforeMethod
	
	public void webdriversetup() {
		WebDriverManager.chromedriver().setup();
		this.driver= new ChromeDriver();
	
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		this.driver.quit();
	}
	
	
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Alerttesting.Browsercontrol;
import Seleniummaven2.driversetup;

public class MainDemo extends driversetup{

	@BeforeMethod
	void setpu() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Robi\\Documents\\Drivers\\chromedriver.exe");
			
	}
	@Test()
	
	
	void runOnCrome() throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		}
	@Test()
	
	
	void runOnCrome1() throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		}
	@Test()
	
	
	void runOnCrome2() throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		}
	@Test()
	
	
	void runOnCrome3() throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		}
//@Test
//
//	void runonFirefox() throws InterruptedException {
//		System.setProperty("Webdriver.firefox.driver", "C:\\Users\\\\Robi\\Documents\\Drivers\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(20000);
//		driver.close();
//	}
}

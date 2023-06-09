import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainDemo2 {
	private WebDriver driver;
	
	@BeforeMethod
	void setpu() {

	
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Robi\\Documents\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	
	}
	
	@AfterMethod
	void closing() {
		driver.close();
	driver.quit();
		
	}
//	@DataProvider(name="user-data")
//	Object[][] dataSet(){
//		Object[][]data= {
//				{"standard_user","secret_sauce"},
//				{"locked_out_user","secret_sauce"},
//				{"problem_user","secret_sauce"},
//				{"performance_glitch_user","secret_sauce"},
//		};
//		return data;
//	}
	
	
	@Test(dataProviderClass = Exceldataprovider.class,  dataProvider="Excel-user-data")
	
	void runOnCrome(String username, String password) throws InterruptedException  {
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
		Boolean isDisplayed = driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
		Assert.assertTrue(isDisplayed);
		
		
		
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

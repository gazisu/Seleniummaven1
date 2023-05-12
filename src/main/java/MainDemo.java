import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainDemo {

	@Test
	
	
	void runOnCrome() throws InterruptedException  {
		System.setProperty("Webdrive.chrome.driver", "C:\\Users\\Robi\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
//		driver.close();
		}

	
}

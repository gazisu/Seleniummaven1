package Seleniummaven2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Netlifyapp extends driversetup {
	
	private static final JavascriptExecutor JavascriptExecutor = null;

	@BeforeMethod
	
	public void browsercontrol() {
		
		driver.get("https://trytestingthis.netlify.app/");
	}
	
//	@AfterMethod
//	
//	public void browserclose() {
//		this.driver.close();
		
//	}
	@Test (priority=1)
	
	public void firstname() throws InterruptedException {
		driver.findElement(By.id("fname")).sendKeys("Gazi");
		Thread.sleep(3000);
		driver.findElement(By.id("lname")).sendKeys("Salah Uddin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/label[4]")).click(); //for male
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/label[5]")).click(); //for female
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/label[6]")).click(); //for other
		Thread.sleep(3000);
		
		WebElement dropDown = this.driver.findElement(By.id("option"));
		Select selectobject = new Select(dropDown);
		Thread.sleep(3000);
		driver.findElement(By.id("option")).click();
		selectobject.selectByIndex(1);
		Thread.sleep(3000);
		selectobject.selectByValue("option 2");
		Thread.sleep(3000);
		selectobject.selectByVisibleText("Option 3");
		Thread.sleep(3000);
		
		Select multselect= new Select(driver.findElement(By.id("owc")));
		multselect.selectByIndex(1);
		Thread.sleep(3000);
		multselect.selectByIndex(3);
		Thread.sleep(3000);
		
		Select checkbox = new Select(driver.findElement(By.id("moption")));
		checkbox.selectByIndex(1);
		Thread.sleep(3000);
		checkbox.selectByIndex(2);
		Thread.sleep(3000);
		checkbox.selectByIndex(3);
		Thread.sleep(3000);
		
		
		WebElement color = this.driver.findElement(By.id("a"));
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) this.driver;
		jse.executeScript("javascript:document.getElementByID('a') , value=100");
		Thread.sleep(2000);
	
		
	}



	

}

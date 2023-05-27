package Alerttesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerttesting extends Browsercontrol {

	@BeforeMethod
	public void browserconfig() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@AfterMethod
	public void closebrowser() {
		this.driver.close();
	}
	@Test(priority=1)
	
	public void alerttest() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		if(driver.getPageSource().contains("You successfully clicked an alert")) 
		{
			System.out.println("You successfully clicked an alert");
		}
	}
	
	@Test(priority =2)
	
	public void aterttest2() throws InterruptedException {
		this.driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).clear();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3500);
		if(driver.getPageSource().contains("You clicked: Ok")) {
			System.out.println("You clicked: Ok");
			
		}
	}
	
	@Test(priority =3)
	
	public void aterttest3() throws InterruptedException {
		this.driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(3500);
		if(driver.getPageSource().contains("You clicked: Cancel")) {
			System.out.println("You clicked: Cancel");
			
		}
	}
	
	@Test(priority =4)
	
	public void aterttest4() throws InterruptedException {
		this.driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Gazi");
		alert.accept();
		Thread.sleep(3500);
		if(driver.getPageSource().contains("You entered: Gazi")) {
			System.out.println("You entered: Gazi");
			
		}
	}
	
}

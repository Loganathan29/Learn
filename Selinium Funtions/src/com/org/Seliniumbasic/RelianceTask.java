package com.org.Seliniumbasic;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Set;

public class RelianceTask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( "webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome New Driver/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver= new ChromeDriver() ;
		driver.get("https://www.reliancedigital.in");
		 Thread.sleep(2000);
		 
		 WebElement find = driver.findElement(By.xpath("//button[@id='wzrk-cancel']"));
		 find.click();
		 Thread.sleep(3000);
		 
		 WebElement a = driver.findElement(By.xpath("//div[@class='nav__title']"));
		 Actions act = new Actions(driver);
		 act.moveToElement(a).build().perform();
		 Thread.sleep(5000);
		 
		 WebElement b =driver.findElement(By.xpath("//a[text()='Smartphones']"));
		 b.click();
		 Thread.sleep(2000);
		 
		 WebElement c= driver.findElement(By.xpath("//img[@title='Moto-Edge 30.jpg']"));
		 c.click();
		 Thread.sleep(5000);
		 
		 String parent = driver.getWindowHandle();
		 driver.findElement(By.xpath("//img[@class='img-responsive imgCenter']")).click();
		 Thread.sleep(5000);
		 Set<String> child= driver.getWindowHandles();
		 for(String All:child){
			if(!All.equals(parent)) {
				driver.switchTo().window(All);
			}	
				
			}
		 WebElement find1=driver.findElement(By.xpath("//input[@id='RIL_PDPInputPincode']"));
		 find1.sendKeys("603002");
		 Thread.sleep(5000);
	}
}
			 
			 
			 
			 
			 
		 
		 

		
		 
		 
		 
		 
		
		
		
		 
		 
		 
		 
		 

	

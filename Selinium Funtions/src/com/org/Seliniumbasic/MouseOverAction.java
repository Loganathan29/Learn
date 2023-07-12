 package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/CHROME UBDATE VERSION/chromedriver_win32 (5)/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(5000);
		
       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       Thread.sleep(5000);
      WebElement find = driver.findElement(By.xpath("//div[text()= 'Electronics']"));
       Actions act = new Actions(driver) ;
       Thread.sleep(3000);
       act.moveToElement(find).build().perform();

       
       
       driver.close();

	}
 
}

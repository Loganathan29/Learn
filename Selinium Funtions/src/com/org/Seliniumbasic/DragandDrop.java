package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome Driver/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	 driver.get("https://www.jqueryui.com");
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 
	 driver.findElement(By.linkText("Droppable")).click();
	 Thread.sleep(5000);
	 
	  int size = driver.findElements(By.tagName("//iframe")).size();
	 System.out.println(size);
	 
	 //driver.switchTo().frame("id);
	// driver.switchTo().frame("name");
	 
	 driver.switchTo().frame(0);
	 Thread.sleep(3000);
	 
	//WebElement find= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	driver.switchTo().frame(find);
	//Thread.sleep(4000);
	 
	 
	 WebElement from= driver.findElement(By.id("draggable"));
	 WebElement to= driver.findElement(By.id("droppable")); 
	
	
	 Actions act = new Actions(driver);
	 act.clickAndHold(from).moveToElement(to).release(to).build().perform();
			
     driver.close();
	}

}

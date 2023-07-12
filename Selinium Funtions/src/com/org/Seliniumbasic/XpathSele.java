package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/chrome driver new new/chromedriver_win32 (4)/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.datatables.net/");
	
	// 1 CLOUD TABLES LINK-------OK
	//driver.findElement(By.xpath("//a[@ href='https://cloudtables.com']")).click();
	//driver.findElement(By.linkText("https://cloudtables.com")).click();
	
	// 2 SEARCH BOX
	//WebElement fin=driver.findElement(By.name("//input[@name='q']"));
	WebElement fi=driver.findElement(By.xpath( "//input[@placeholder='Search . . .']"));
	fi.sendKeys("7");
	
	//ANOTHER SEARCH-------OK
	WebElement find3=driver.findElement(By.xpath("//input[@type='search']"));
	find3.sendKeys( "Bradley Greer");
	
	//driver.findElement(By.xpath("//*[@id='example']/tbody/tr[5]/td[1]/text()")).click();
	
	
// 3 LOGIN & REGISTER-------OK
	driver.findElement(By.xpath("//a[@class='register-action follow-link login']")).click();
	WebElement find=driver.findElement(By.id("DTE_Field_register-username"));
	find.sendKeys("Loganathan"); 
	
	WebElement find2 =driver.findElement(By.id("DTE_Field_register-email"));
	find2.sendKeys("loganathanlogu");
	driver.close();
    }
   
}

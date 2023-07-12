package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome New Driver/chromedriver_win32 (1)/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get( "https://www.demoqa.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath(xpathExpression));
	Alert a =driver.switchTo().alert();
	String st=a.getText();
	System.out.println(st);
	Thread.sleep(4000);
	a.accept();
	
	

	}

}

package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Desktop/Chrome New Driver/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demoqa.com/webtable");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement  find= driver.findElement(By.xpath( "//h1[@text='This site can’t be reached']"));
		String a =find.getText();
		System.out.println(a);
		
		
		 
		
		
		

	}

	
	

}

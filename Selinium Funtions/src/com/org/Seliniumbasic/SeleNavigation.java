package com.org.Seliniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleNavigation {

	public static void main(String[] args) throws InterruptedException  { 
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Desktop/Chrome Driver/chromedriver_win32/chromedriver.exe" );
       WebDriver driver= new ChromeDriver();
       driver.get("http://www.facebook.com/");
       Thread.sleep(5000);
       
       driver.navigate().to("http://www.youtube.com");
       Thread.sleep(5000);
       
       driver.navigate().back();
       Thread.sleep(5000);
       
       driver.navigate().forward();
       Thread.sleep(5000);
       
       driver.navigate().refresh();
       Thread.sleep(5000);
       
       driver.close();

	}

}

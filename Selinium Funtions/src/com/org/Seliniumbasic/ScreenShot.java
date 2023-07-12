 package com.org.Seliniumbasic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/CHROME UBDATE VERSION/chromedriver_win32 (5)/chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();
    driver.get ("http://www.facebook.com");
    Thread.sleep(5000);
    
    TakesScreenshot tk = (TakesScreenshot) driver;
    File from= tk.getScreenshotAs(OutputType.FILE);
    File to = new File("E:/java/fb.png");
    Files.copy(from, to); 
    
//   TakesScreenshot th=(TakesScreenshot) driver;  
//   File tod=th.getScreenshotAs(OutputType.FILE);
//   File fro=new File("path");
//   Files.copy(from, to);
   

	}

}

package com.org.Seliniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumBasics {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome Driver/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(5000);
		
		int length = title.length();
	    System.out.println(length);
	

		
	    String currenturl=driver.getCurrentUrl();
	    System.out.println(currenturl);
	
	    int len= title.length();
		System.out.println(len);
		
       // String pagesource=driver.getPageSource();
		//System.out.println(pagesource);	
		
		driver.close();

	}

}

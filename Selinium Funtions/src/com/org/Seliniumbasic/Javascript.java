package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome Driver/chromedriver_win32 (3)/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement color=driver.findElement(By.xpath("//*[@id='loginbutton']"));
		color.click();
		Javascript.flash(color,driver);		
		
	}

	private static void flash(WebElement color, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
//*[@id="loginbutton"]
package com.org.Seliniumbasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome New Driver/chromedriver_win32 (1)/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
driver.get("https://www.naukri.com/top-company-jobs");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
Thread.sleep(5000);

String parent= driver.getWindowHandle();
System.out.println(parent);
Thread.sleep(5000);

driver.findElement(By.xpath("//a[@title='3i Infotech Careers']")).click();
Set<String>child=driver.getWindowHandles();
System.out.println(child);


for(String overall:child){
if(!overall.equals(parent)){
	driver.switchTo().window(parent);
	String title= driver.getTitle();
	System.out.println(title);
}
}
  driver.findElement(By.xpath("//a[@class='title fw500 ellipsis']")).click();
  Thread.sleep(5000);

		
}


	}



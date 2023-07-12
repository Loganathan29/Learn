
//package com.org.Seliniumbasic;
//                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class SeleCheckbox {
//
//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/Users/ezhilarasan/Desktop/bin/chromedriver");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://ironspider.ca/forms/checkradio.htm");
//		driver.manage().window().maximize();
//		List<WebElement> find = driver.findElements(By.xpath("//blockquote[1]/form/input"));
//		
//		for (WebElement web : find) {
//			web.click();
//		}
//	}
//  } 

package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleCheckbox{ 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ezhilarasan/Desktop/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		WebElement find = driver.findElement(By.xpath("//blockquote[2]/form/input[2]"));
		find.click();
		boolean selected = find.isSelected();
		if(selected == true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	
                     }}
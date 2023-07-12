package com.org.Seliniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/CHROME UBDATE VERSION/chromedriver_win32 (5)/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://letcode.in/dropdowns");
driver.manage().window().maximize();
Thread.sleep(5000);
//dropdown la lot of nums details irukum athula onna select pandrathu
WebElement find = driver.findElement(By.xpath("//select[@id='fruits']"));
Select fruits= new Select(find);
fruits.selectByVisibleText("Orange");

//multiple select
WebElement hero=driver.findElement(By.id("superheros"));
Select heros=new Select(hero);
boolean her =heros.isMultiple();
System.out.println("ismultiple" +her);
heros.selectByIndex( 2);
heros.selectByValue("cm");
heros.selectByValue("bt");
List<WebElement>grpheros=heros.getAllSelectedOptions();
//for(WebElement  finalhero : grpheros)
//System.out.println(finalhero);


WebElement country = driver.findElement(By.id("country"));
Select mycountry= new Select(country);
((WebElement) mycountry).getText();
System.out.println(mycountry);



	}

}

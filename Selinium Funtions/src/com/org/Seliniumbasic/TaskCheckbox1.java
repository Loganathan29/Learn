   package com.org.Seliniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCheckbox1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Desktop/Chrome New Driver/chromedriver_win32 (1)/chromedriver.exe");
    WebDriver driver =  new ChromeDriver();
    driver.get("https://demoqa.com/elements");
    Thread.sleep(5000);
    
    
   WebElement find= driver.findElement(By.xpath("//span[text()='Check Box']"));
    find.click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/'span/button']")).click();
    Thread.sleep(5000);

	}

}

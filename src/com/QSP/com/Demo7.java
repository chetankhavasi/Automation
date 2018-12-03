package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
{
 public static void main(String[] args) 
 {
	    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		//checking through  css selector
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("chetan");
 }
}

package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo8
{
 public static void main(String[] args) 
 {
	 System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.seleniumhq.org/download/");
	driver.findElement(By.xpath("//td[text()='Ruby']/../td[4]")).click();//clicking on version
	

 }
}

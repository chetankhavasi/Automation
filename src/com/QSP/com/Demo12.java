package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 
{
	static
    {
    	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
    }
 public static void main(String[] args) 
 {
	WebDriver driver=new ChromeDriver();  
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/chetu/Documents/Sample7.html");
	WebElement fname=driver.findElement(By.id("fn"));
	if(fname.isEnabled())
	{
		System.out.println("enabled");
	}
	else
	{
		System.out.println("disabled");
	}
	
 }
}

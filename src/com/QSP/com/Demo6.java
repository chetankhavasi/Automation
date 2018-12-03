package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/chetu/Documents/test2.html");
	
	    //by using id
		driver.findElement(By.id("fp")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		
		//by using name
		driver.findElement(By.name("forgot")).click();
		Thread.sleep(1000);
		driver.navigate().back();

			
	    //by using classname
		driver.findElement(By.className("Pass")).click();
		Thread.sleep(1000);
		driver.navigate().back();
			
			
	    //by using tag name
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
			
			
		//by using linxText
		driver.findElement(By.linkText("Forgot Password...")).click();
		Thread.sleep(1000);
		driver.navigate().back();
			
			
		//by using partialLinkText
		driver.findElement(By.partialLinkText("Inbox")).click();
		Thread.sleep(1000);
		driver.navigate().back();
        driver.close();
	
	}

}

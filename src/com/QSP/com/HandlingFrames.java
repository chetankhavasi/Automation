package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames 
{
	static
    {
    	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
    }
	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("file:///C:/Users/chetu/Documents/page1.html");
	      driver.findElement(By.id("fn")).sendKeys("chetan");
	      
	      //to switch to inner html page
	      driver.switchTo().frame(0);
	      driver.findElement(By.id("mn")).sendKeys("Prakash");
	      
	      
	      //to switch to default page
	      driver.switchTo().defaultContent();
	      driver.findElement(By.id("ln")).sendKeys("Khavasi");
	      
	      Thread.sleep(1000);
	      driver.close();
	      
	}
}

package com.QSP.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{
	static
    {
    	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
    }
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		  WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	      driver.get("https://demo.actitime.com/login.do");
	      WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
	      Thread.sleep(4000);
	      
	      //using Actions Class
	     /* Actions act=new Actions(driver);
	      act.contextClick(link).perform();
	      Thread.sleep(1000);*/
	      
	      //using Robot class
	      Robot r=new Robot();
	      r.keyPress(KeyEvent.VK_W);
	      r.keyRelease(KeyEvent.VK_W);
	      Thread.sleep(2000);
	      driver.close();
	      
	}
}

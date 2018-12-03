package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization 
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
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get("http://demo.actitime.com/login.do");
	     driver.findElement(By.id("username")).sendKeys("admin");;
	     driver.findElement(By.name("pwd")).sendKeys("manager");;
	     driver.findElement(By.xpath("//div[.='Login ']")).click();
	     String eTitle="actiTIME-Enter Time-Track";
	     WebDriverWait wait=new WebDriverWait(driver, 10);
	     try
	     {
	    	 wait.until(ExpectedConditions.titleIs(eTitle));
	    	 System.out.println("passssssssssssss");
	     }
	     catch(Exception e)
	     {
	    	 System.out.println("faaaaaiiiiilllllllllll");
	     }
	     driver.close();
	}

}

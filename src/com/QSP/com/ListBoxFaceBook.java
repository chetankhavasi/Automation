package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxFaceBook 
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
	     driver.get("https://www.facebook.com/");
	     
	     //day
	     WebElement DAY=driver.findElement(By.id("day"));
	     Select sel=new Select(DAY);
	     Thread.sleep(1000);
	     sel.selectByValue("1");
	     Thread.sleep(1000);
	     
	     //month
	      WebElement MONTH=driver.findElement(By.id("month"));
	      sel=new Select(MONTH);
	      sel.selectByValue("6");
	      Thread.sleep(1000);
	      
	      //year
	      WebElement YEAR=driver.findElement(By.id("year"));
	      sel=new Select(YEAR);
	      sel.selectByValue("1996");
	     
    }
}

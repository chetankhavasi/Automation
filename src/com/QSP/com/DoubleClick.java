package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick 
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
     driver.get("http://www.plus2net.com/javascript.tutorial/on'db'click_demo.php");
 }
}

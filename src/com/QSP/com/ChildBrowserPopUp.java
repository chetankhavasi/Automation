package com.QSP.com;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp 
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
	      driver.get("https://www.naukri.com/");
	      //using getWindowHandle()
	      String address = driver.getWindowHandle();
	      System.out.println(address);
	      
	      
	     /* 
	      //using getWindowHandles()
	     Set<String> wh = driver.getWindowHandles();
	      int count = wh.size();
	      System.out.println(count);
	    for(String address:wh)
	    {
			System.out.println(address);
	    }
	    */
	      driver.quit();
	}     
}

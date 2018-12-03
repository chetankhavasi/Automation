package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp 
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
	      driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
          driver.findElement(By.id("loginbutton")).click();
          Thread.sleep(1000);
          Alert a = driver.switchTo().alert();	
          Thread.sleep(1000);
          //to get the text
          String text=a.getText();
          System.out.println(text);
          //to click ok
          a.accept();
          driver.close();
          }

}

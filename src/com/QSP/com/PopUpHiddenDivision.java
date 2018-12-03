package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHiddenDivision 
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
	      driver.get("https://www.cleartrip.com/?dxid=EAIaIQobChMI1o-t-t383gIVRYuPCh1o8gm0EAAYASAAEgLW2fD_BwE&gclid=EAIaIQobChMI1o-t-t383gIVRYuPCh1o8gm0EAAYASAAEgLW2fD_BwE");
	      driver.findElement(By.id("DepartDate")).click();
	      String xp = "//span[.='December']/../../..//a[.='10']";
	      driver.findElement(By.xpath(xp)).click();
	      driver.close();
	      } 
}

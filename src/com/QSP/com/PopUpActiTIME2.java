package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpActiTIME2 
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
	      driver.get("https://demo.actitime.com/login.do");
	      Thread.sleep(1000);
	      String text = driver.getTitle();
	      System.out.println(text);
	      driver.findElement(By.id("username")).sendKeys("admin");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	      Thread.sleep(1000);
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(1000);
	      String text2 = driver.getTitle();
	      System.out.println(text2);
	      driver.findElement(By.xpath("//div[.='TASKS']")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//div[.='Accounting']/../../..//div[@class='img']")).click();
	      Thread.sleep(5000);
	      Alert a=driver.switchTo().alert();
	      Thread.sleep(1000);
	      a.accept();
	      Thread.sleep(1000);
	     
          	      

	}

}

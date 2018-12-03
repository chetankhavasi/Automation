package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpActiTIME 
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
	      driver.findElement(By.id("username")).sendKeys("admin");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	      Thread.sleep(1000);
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(5000);
	     
	      driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
	      driver.findElement(By.xpath("//a[.='About your actiTIME']")).click();
	      
	      WebElement text = driver.findElement(By.xpath("//span[.='(build 40469)']"));
	     System.out.println(text.getText());
	     
	}

}

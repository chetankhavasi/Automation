package com.QSP.com;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 
{
 public static void main(String[] args) throws InterruptedException 
 {
	  Scanner s=new Scanner(System.in);
		System.out.println("enter browser");
		String  browser=s.nextLine();
		WebDriver driver=null;
		if(browser.equals("ff"))
		{
	    System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	    driver =new FirefoxDriver();
		}
		else
		{
		if(browser.equals("gc"))
		{
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 driver=new ChromeDriver();{
		}
	    }
		Thread.sleep(1000);
		driver.close();
}
}
}


package com.QSP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{
 public static void main(String[] args) throws InterruptedException 
 {
	//to open the browser
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//to enter the url
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		//to navigate previous page
		driver.navigate().back();
		//driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		
		//to navigate the next page
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//to refresh the current page
		driver.navigate().refresh();
}
}

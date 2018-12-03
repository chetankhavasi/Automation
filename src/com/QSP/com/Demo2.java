package com.QSP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
 //to open the browser
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//to maximize the window
	driver.manage().window().maximize();
	
	//to enter the url
	driver.get("https://www.google.com/");
	
	
	//to get the title of web page
	String title=driver.getTitle();
	System.out.println("page name: "+title);
	
	
	//to get the title of the current page
	String url=driver.getCurrentUrl();
	System.out.println("URL: "+url);
	
	//to close the browser
	Thread.sleep(1000);
	driver.close();
	}
}

package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector 
{
 public static void main(String[] args) throws InterruptedException 
 {
	    System.setProperty("webdriver.gecko.driver","/Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("chetan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("onelove143");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='u_0_j']")).sendKeys("first");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='u_0_l']")).sendKeys("khavasi");
		Thread.sleep(1000);
	
		driver.findElement(By.cssSelector("input[id='u_0_o']")).sendKeys("8971941859");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='u_0_v']")).sendKeys("onelove");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='day']")).sendKeys("28");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='month']")).sendKeys("07");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='year']")).sendKeys("1996");
		Thread.sleep(1000);
		
}
 
}

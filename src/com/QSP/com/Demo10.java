package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/chetu/Documents/Sample7.html");
	WebElement submit=driver.findElement(By.id("s"));
	System.out.println(submit);
	Thread.sleep(1000);
	
	//to check submit button
	submit.submit();
	driver.navigate().back();
	Thread.sleep(1000);
	
	WebElement fname=driver.findElement(By.id("fn"));
	
	//to enter text
	fname.sendKeys("chetan");
	Thread.sleep(1000);
	
	//to clear
	fname.clear();
	Thread.sleep(1000);
	
	
	WebElement fb=driver.findElement(By.linkText("FaceBook"));
	
	//to get TAGNAME of an element
	String tag=fb.getTagName();
	System.out.println("tag name: "+tag);
	
	//to get TEXT of an element
	String text=fb.getText();
	System.out.println("text: "+text);
	
	//to get ATTRIBUTE name
	String attribute=fb.getAttribute("https://www.facebook.com/");
	System.out.println("attribut name: "+attribute);
	
	//to get COLOR
	String color=fb.getCssValue("color");
	System.out.println("color: "+color);
	
	//to get size
	String size=fb.getCssValue("font-size");
	System.out.println("size: "+size);

	driver.close();
	
 }
}

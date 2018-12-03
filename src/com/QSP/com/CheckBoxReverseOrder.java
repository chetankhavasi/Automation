package com.QSP.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxReverseOrder 
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
		driver.get("file:///C:/Users/chetu/Documents/Sample9.html");
		List<WebElement> TotalCheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count=TotalCheckBox.size();
		System.out.println(count);
		/*
		//reverse oreder
		for(int i=4;i>=0;i--)
		{
			WebElement click=TotalCheckBox.get(i);
			click.click();
			Thread.sleep(1000);
		}*/
		
		//even number
		for(int i=4;i>=0;i--)
		{
			if(i%2==0)
			{
			WebElement click=TotalCheckBox.get(i);
			click.click();
			Thread.sleep(1000);
			}
		}
		/*
		//to odd number
		for(int i=4;i>=0;i--)
		{
			if(i%2!=0)
			{
			WebElement click=TotalCheckBox.get(i);
			click.click();
			Thread.sleep(1000);
			}
		}
		*/
 }
}

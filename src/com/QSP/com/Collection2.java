package com.QSP.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection2 
{
	static
    {
    	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
    }
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/chetu/Documents/Sample8.html");
		List<WebElement> AllLinks=driver.findElements(By.xpath("//a"));
		
		//to get number of links
		int count=AllLinks.size();
		System.out.println(count);
		
		//to print all links
		for(int i=0;i<count;i++)
		{
			WebElement link=AllLinks.get(i);
			String text=link.getText();
			System.out.println(text);
		}

	}

}

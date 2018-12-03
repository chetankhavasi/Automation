package com.QSP.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Collection3 
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
		List<WebElement> AllCB=driver.findElements(By.xpath("//input[@type='checkbox']"));
        //to count the number of checkboxes
		int count=AllCB.size();
		System.out.println(count);
		
		//to select all checkbox
		for(int i=0;i<count;i++)
		{
			WebElement CB=AllCB.get(i);
			CB.click();
		}
		Thread.sleep(1000);
   }
}

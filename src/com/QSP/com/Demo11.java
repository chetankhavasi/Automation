package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 
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
      driver.get("https://demo.actitime.com/login.do;jsessionid=13CB7D520377EE86DC34D75FD4808832");
      WebElement un=driver.findElement(By.id("username"));
      
      //to get size of an element
      Dimension size=un.getSize();
      int h=size.getHeight();
      int w=size.getWidth();
      System.out.println("height: "+h);
      System.out.println("width: "+w);
      System.out.println("-----------------------------------------");
      
      //to get location
      Point loc=un.getLocation();
      int x=loc.getX();
      int y=loc.getY();
      System.out.println("x axis: "+x);
      System.out.println("y axis: "+y);
      System.out.println("=======================================");
      
      //to check whether element is present or not
      if(un.isDisplayed())
      {
    	  System.out.println("present");
      }
      else
      {
    	  System.out.println("not present");
      }
      WebElement cb=driver.findElement(By.id("keepLoggedInCheckBox"));
      
      
      //to check element is selected
      if(cb.isSelected())
      {
    	  System.out.println("selected");
      }
      else
      {
    	  System.out.println("not selected");
      }
      Thread.sleep(1000);
      
	}

}

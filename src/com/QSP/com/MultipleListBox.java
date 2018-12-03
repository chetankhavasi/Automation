package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox 
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
         driver.get("file:///C:/Users/chetu/Documents/multiplelistbox.html");
         WebElement hotel=driver.findElement(By.id("maarya"));
         Select sel=new Select(hotel);
         
         //to check listbox is singleselect or multiselect
         if(sel.isMultiple())
         {
        	 System.out.println("multi-select");
         }
         else
         {
        	 System.out.println("single select");
         }
         
         //select by index
         sel.selectByIndex(1);
         Thread.sleep(1000);
         
         //select by value
         sel.selectByValue("p");
         Thread.sleep(1000);
         
         //select by text
         sel.selectByVisibleText("Fish");
         Thread.sleep(1000);
         
         //deselect by index
         sel.deselectByIndex(1);
         Thread.sleep(1000);
         
         //deselect by value
         sel.deselectByValue("p");
         Thread.sleep(1000);
         
         //deselect by text
         sel.deselectByVisibleText("Fish");
         Thread.sleep(1000);
         
         //deselection all
         sel.deselectAll();
	}

}

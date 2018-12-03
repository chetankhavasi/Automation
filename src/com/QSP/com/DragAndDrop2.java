package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 
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
	      driver.get("http://jqueryui.com/droppable");
	      WebElement drag = driver.findElement(By.className("ui-widget-content ui-draggable ui-draggable-handle"));
	      WebElement drop = driver.findElement(By.id("droppable"));
	      Actions act=new Actions(driver);
	      act.dragAndDrop(drag,drop).perform();
	      Thread.sleep(1000);
	      driver.close();
	      
    }
}

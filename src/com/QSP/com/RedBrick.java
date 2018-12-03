package com.QSP.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RedBrick 
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
  	driver.get("https://home.redbrickhealth.com/");
  	WebElement solution=driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
  	Actions act=new Actions(driver);
  	act.moveToElement(solution).perform();
  	Thread.sleep(5000);
    List<WebElement> address = driver.findElements(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']/..//a[@class='nav-link']"));
    int count=address.size();
    System.out.println(count);
    for(int i=0;i<count;i++)
  	{
  		WebElement dropdownmenu = address.get(i);
  		String text = dropdownmenu.getText();
  		System.out.println(text);
  	}
  	driver.close();
  	
 }
}

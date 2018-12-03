package com.QSP.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
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
driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIm-G77qPm3gIVjoiPCh2dGATqEAAYASAAEgKwgvD_BwE&ef_id=EAIaIQobChMIm-G77qPm3gIVjoiPCh2dGATqEAAYASAAEgKwgvD_BwE:G:s&s_kwcid=AL!739!3!284726417981!e!!g!!flipcart&semcmpid=sem_8024046704_brand_eta_goog");
driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iphone");
		List<WebElement> AllAutoSuggestion=driver.findElements(By.xpath("//img[@class='_2VeolH _3I5S6S']"));
		int count=AllAutoSuggestion.size();
		System.out.println(count);
  }
}

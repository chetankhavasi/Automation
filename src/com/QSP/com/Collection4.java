package com.QSP.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Collection4 
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
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");
		Thread.sleep(2000);
		List<WebElement> AllSuggestion=driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		
		//to count number of suggestions
		int count=AllSuggestion.size();
		System.out.println(count);
		
		//to print all sugggestions
		for(WebElement suggestion:AllSuggestion)
		{
			String text=suggestion.getText();
			System.out.println(text);
		}
		//to click on last suggestion
		WebElement s=AllSuggestion.get(count-1);
		s.click();
 }
}

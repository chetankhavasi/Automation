package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookCheckBox 
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
	driver.get("https://www.facebook.com/");
	WebElement FemaleCheckBox=driver.findElement(By.xpath("//input[@value='1']"));
	Thread.sleep(1000);

	if(FemaleCheckBox.isSelected())
	{
		System.out.println("selected");
	}
	else
	{
		System.out.println("not selected");
	}
    }
}

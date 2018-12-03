package com.QSP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{
 public static void main(String[] args) 
 {
		//to open the browser
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.naukari.com/");
		driver.quit();
		

}
}

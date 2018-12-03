package com.QSP.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFacebook 
{
 public static void main(String[] args) throws InterruptedException 
 {
   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();	
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
   Thread.sleep(1000);
   driver.findElement(By.id("email")).sendKeys("chtnkhvsrj.raj5@gmail.com");
   driver.findElement(By.id("pass")).sendKeys("chetanchinnu");
   driver.findElement(By.cssSelector("input[type='submit']")).click();
  
 }
}

package com.QSP.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageMainMethod 
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
	      driver.get("https://www.facebook.com/");
	      LoginPage lp=new LoginPage(driver);
	      lp.enterUserName("chtnkhvsrj.raj5@gmail.com");
	      lp.enterPassWord("chetanchinnu");
	      lp.clickLoginButton();
	      driver.close();
	}
}

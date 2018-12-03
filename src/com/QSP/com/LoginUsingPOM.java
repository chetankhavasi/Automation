package com.QSP.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUsingPOM 
{
 //POM class
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="u_0_2")
	private WebElement login;
	
	public LoginUsingPOM(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterMail(String i)
	{
	  email.sendKeys(i);	
	}
	public void EnterPassword(String pw)
	{
		pass.sendKeys(pw);
	}
	public void ClickLogin()
	{
		login.click();
	}
}

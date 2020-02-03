package com.whiteboxframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver ldriver;
	
	//create constructor
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="loginButton")
	WebElement loginbtn;
	
	@FindBy(id="username")
	WebElement textusername;
	
	@FindBy(id="password")
	WebElement textpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	public void clickLoginbtn()
	{
		loginbtn.click();
	}
	
	public void setUserName(String username)
	{
		textusername.sendKeys(username);
	}
	public void setPassword(String password)
	{
		textpassword.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btnlogin.click();
	}
	
	
	
}


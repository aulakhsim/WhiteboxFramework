package com.whiteboxframework.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.whiteboxframework.pageObjects.LoginPage;

public class TC_LoginTest001 extends BaseClass {

	@Test
	public void loginTest() throws IOException
	{
		Logger.info("Open the URL");
		driver.get(baseURL);
		LoginPage lp= new LoginPage(driver);
		
		Logger.info("Click on the Login button");
		lp.clickLoginbtn();
		
		Logger.info("Enter the Username");
		lp.setUserName(username);
		
		Logger.info("Enter the Password");
		lp.setPassword(password);
		
		Logger.info("Click on Login button to go to Home Page");
		lp.clickSubmit();
		
		String gettitle=driver.getTitle();
		//System.out.println("Title of the page is: "+ gettitle);
		
		
		if(driver.getTitle().equals(gettitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
		}
		
	}
}

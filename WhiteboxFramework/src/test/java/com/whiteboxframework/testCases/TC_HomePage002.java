package com.whiteboxframework.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.whiteboxframework.pageObjects.LoginPage;
import com.whiteboxframework.utilities.XLUtils;

public class TC_HomePage002 extends BaseClass{
	
	@Test 
	public void HomePage()
	{
		driver.get(baseURL);
		
		LoginPage lp= new LoginPage(driver);
		
		lp.clickLoginbtn();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Logger.info("Click on the Home Tab");
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		Logger.info("Click on the Free Demo Access ");
		driver.findElement(By.id("feedback_button"));
		
		Logger.info("Click No on the Free Demo Access to close the window");
		driver.findElement(By.id("close"));
	}
	
/*	@DataProvider(name="LoginDate")
	String[] [] getData() throws IOException
	{
		String path=System.getProperty("C:/Users/aulak/Desktop");
		int rownum =XLUtils.getRowCount(path, "Sheet1");
		int cocount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][cocount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<cocount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}*/

}

package com.whiteboxframework.testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.whiteboxframework.pageObjects.LoginPage;

public class TC_SchedulePageTest003 extends BaseClass{
	
	@Test
	public void SchedulePage()
	{
		driver.get(baseURL);
		
		LoginPage lp= new LoginPage(driver);
		
		lp.clickLoginbtn();
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		driver.findElement(By.xpath("//a[text()='Schedule']")).click();
		
	}

}

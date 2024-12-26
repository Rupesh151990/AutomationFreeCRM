package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoradPage;

public class DashBoard_TestCase extends TestBase{
	
	DashBoradPage dbPage;
	
	public DashBoard_TestCase() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intilization();
	}
	
	@Test
	public void VerifyDashBoardPage() {
		dbPage = new DashBoradPage();
		dbPage.getLoginLink();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

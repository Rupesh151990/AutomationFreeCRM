package com.qa.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DashBoradPage;
import com.qa.pages.LoginPage;

public class HomePage_TestCase extends TestBase{
	
	DashBoradPage dbPage;
	LoginPage lgPage;
	
	public HomePage_TestCase() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		intilization();
		dbPage= new DashBoradPage();
		lgPage = new LoginPage();
		
		dbPage.getLoginLink();
	}
	 
	@Test
	public void VerifyValidLogin() {
		
		
	lgPage.getValidCredentails();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

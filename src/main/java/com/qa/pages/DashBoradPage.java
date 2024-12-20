package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashBoradPage extends TestBase {
	
	public DashBoradPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()=\"Login\"]")
	WebElement loginbttn;
	
	public LoginPage getLoginLink() {
		loginbttn.click();
		
		return new LoginPage();
	}
			

}

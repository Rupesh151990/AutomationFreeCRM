package com.qa.pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;
	
	@FindBy (xpath = "//div[text()='Login']")
	WebElement signBttn;
	
	public HomePage getValidCredentails() {
		
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String> iterator  =windowhandles.iterator();
		
		String parentWindow =iterator.next();
		String childWindow =iterator.next();
		
		driver.switchTo().window(childWindow);
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signBttn.click();
		
		return new HomePage();
	}
}

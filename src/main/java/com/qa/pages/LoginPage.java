package com.qa.pages;

import java.net.http.WebSocket;

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
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signBttn.click();
		
		return new HomePage();
	}
}

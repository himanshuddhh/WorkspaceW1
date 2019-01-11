package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='loginbtn']")
	WebElement loginButton;

	public BMICalculator login(String userName,String passWord) throws IOException
	{
		
		username.sendKeys(userName);
		password.sendKeys(passWord);
		loginButton.click();
		
		return new BMICalculator();
		
	}




}

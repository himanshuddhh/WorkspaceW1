package com.wordpress.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;

public class Loginpage extends Testbase
{
Validation validation=new Validation();
	@FindBy(xpath="//input[@id='usernameOrEmail']")
	WebElement usernameoremail;
	
	@FindBy(xpath="//button[@class='button form-button is-primary']")
	WebElement firstcontinuebutton;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//button[@class='button form-button is-primary']")
	WebElement loginbutton;

	
	public Loginpage() {
		PageFactory.initElements(driver, this);
		}
	public Homepage login(String Username,String Password)
	{
		if(validation.IsElementPresent(driver, "//input[@id='usernameOrEmail']"))
		{
			usernameoremail.sendKeys(Username);
		}
		else
		{
			System.out.println("Username textbox not displayed");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//button[@class='button form-button is-primary']"))
		{
			firstcontinuebutton.click();
		}
		else
		{
			System.out.println("First continue button not displayed");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//input[@id='password']"))
		{
			enterpassword.sendKeys(Password);
		}
		else
		{
			System.out.println("Password text box is not present");
			driver.quit();}
		if(validation.IsElementPresent(driver, "//button[@class='button form-button is-primary']"))
		{
			loginbutton.click();
		}
		else
		{
		System.out.println("Login button is not present");
		driver.quit();
				
		}
				
		
		return new  Homepage();
	}



}

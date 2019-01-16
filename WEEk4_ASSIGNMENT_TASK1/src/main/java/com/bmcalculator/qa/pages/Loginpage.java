package com.bmcalculator.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class Loginpage extends Testbase
{
	Validation validation=new Validation();
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='loginbtn']")
	WebElement Logib_btn;
	public Loginpage() {
	PageFactory.initElements(driver,this);
	}
	public Bmicalculator login(String Username,String pass)
	{
		if(validation.IsElementPresent(driver, "//input[@id='username']"))
		{
			username.sendKeys(Username);
		}
		else
		{
			System.out.println("User name text box not present");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//input[@id='password']"))
		{
			password.sendKeys(pass);
		}
		else
		{
			System.out.println("Password textbox not present");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//input[@id='loginbtn']"))
		{
			Logib_btn.click();
			
		}
		else
			
		{
			System.out.println("Login Button not present");
			driver.quit();
		}
		return new Bmicalculator();
	}
	

}

package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class LoginorsignUppage extends Testbase
{
	Validation validation=new Validation();
@FindBy(xpath="//span[contains(text(),'Register')]//ancestor::button[@class='button']")
 WebElement register_btn;
@FindBy(xpath="//input[@id='email']")
WebElement emailaddresstext_box;
@FindBy(xpath="//input[@id='pass']")
WebElement passwordtextbox;
@FindBy(xpath="//button[@id='send2']")
WebElement login_btn;
public LoginorsignUppage() {
	PageFactory.initElements(driver, this);
}
public Registrationpage clickonregisterbutton()
{
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Register')]//ancestor::button[@class='button']"))
	{
	register_btn.click();
	}
	else
	{
		System.out.println("Registration button not present");
		driver.quit();
	}
	return new Registrationpage();
}
public HomePage login(String email,String password)
{
	if(validation.IsElementPresent(driver, "//input[@id='email']"))
	{
		emailaddresstext_box.sendKeys(email);
	}
	else
	{
		System.out.println("Email text box is not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//input[@id='pass']"))
	{
		passwordtextbox.sendKeys(password);
	}
	else
	{
		System.out.println("Password textbox is not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//button[@id='send2']"))
	{
		login_btn.click();
		if(driver.findElement(By.xpath("//a[contains(text(),'My Account')]")) != null)
		{
			System.out.println("Login Sucess");
		}
		else
		{
			System.out.println("Login failed");
		}
	}
	else
	{
		System.out.println("Login button not present");
		driver.quit();
	}
	
	
	return new HomePage();
}
	

}

package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class Productspage extends Testbase
{
	Validation validation=new Validation();
	@FindBy(xpath="//li[@class='menu-item js-menu-item pull-right icon-link']")
WebElement loginorsignup_btn;
public Productspage() {
	PageFactory.initElements(driver, this);
}
public LoginorsignUppage navigatetologin_or_signup()
{
if(validation.IsElementPresent(driver, "//li[@class='menu-item js-menu-item pull-right icon-link']"))
{
	loginorsignup_btn.click();
	System.out.println("Redirected to login or signup page");
}
else
{
	System.out.println("navigate button for login or signup page is not present");
	driver.quit();
}
return new LoginorsignUppage();
	
}

}

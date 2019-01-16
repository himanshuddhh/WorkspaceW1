package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class Registrationpage extends Testbase

{
Validation validation=new Validation();
@FindBy(xpath="//input[@id='firstname']")
WebElement firstnametextbox;
@FindBy(xpath="//input[@id='lastname']")
WebElement lastname;
@FindBy(xpath="//input[@id='email_address']")
WebElement emailtextbox;
@FindBy(xpath="//select[@id='country']")
WebElement countriesselect;
@FindBy(xpath="//select[@id='customer_individual_role']")
WebElement myroledrop;
@FindBy(xpath="//input[@id='password']")
WebElement paswordtextbox;
@FindBy(xpath="//input[@id='confirmation']")
WebElement confirmpasswordtextbox;
@FindBy(xpath="recaptcha-anchor")
WebElement captchacheckbox;
@FindBy(xpath="//input[@id='agree_terms']")
WebElement agreetermscheck_box;
@FindBy(xpath="//button[@id='registerSubmit']")
WebElement submit_btn;
public Registrationpage() 
{
PageFactory.initElements(driver, this);
}
public void registration()
{
	if(validation.IsElementPresent(driver, "//input[@id='firstname']"))
	{
	firstnametextbox.sendKeys("Himanshu");
	}
	else
	{
		System.out.println("First Name Text Box not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//input[@id='lastname']"))
	{
		lastname.sendKeys("D");
	}
	else
	{
		System.out.println("Last name text box not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//input[@id='email_address']"))
	{
		emailtextbox.sendKeys("himanshuddhh@gmail.com");
	}
	else
	{
		System.out.println("Email text box is not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//select[@id='country']"))
	{
		Select countryselect=new Select(countriesselect);
		countryselect.selectByVisibleText("India");
		
	}
	else
	{
		System.out.println("Countries drop down not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//select[@id='customer_individual_role']"))
	{
		Select myroledropdown=new Select(myroledrop);
		myroledropdown.selectByVisibleText("Technical/developer");
		
	}
	else
	{
		System.out.println("My role drop down not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//input[@id='password']"))
	{
		paswordtextbox.sendKeys("Vidyut@123");
	}
	else
	{
		System.out.println("Password text box is not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//input[@id='confirmation']"))
	{
		confirmpasswordtextbox.sendKeys("Vidyut@123");
	}
	else
	{
		System.out.println("Confirm password not present");
		driver.quit();
	}
	driver.switchTo().frame(driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")));
	if(validation.IsElementPresent(driver, "//div[starts-with(@class,'recaptcha-checkbox-borderAnimation')]"))
	{
		captchacheckbox.click();
	}
	else
	{
		System.out.println("Captcha checkbox not present");
		driver.quit();
	}
	driver.switchTo().defaultContent();
	if(validation.IsElementPresent(driver, "//input[@id='agree_terms']"))
	{
		agreetermscheck_box.click();
	}
	else
	{
		System.out.println("Terms and conditions check box not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[@id='registerSubmit']"))
	{
		submit_btn.click();
		System.out.println("Registration sucessful");
	}
	else
	{
		System.out.println("Submit not present");
		driver.quit();
	}
	
	
}

}

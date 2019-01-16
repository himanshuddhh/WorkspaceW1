package com.bmcalculator.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class Bmicalculator extends Testbase 
{
	Validation validation=new Validation();
	@FindBy(xpath="//input[@id='heightCMS']")
	WebElement enterheighttextbox;
	@FindBy(xpath="//input[@id='weightKg']")
	WebElement enterweighttextbox;
	@FindBy(xpath="//input[@id='Calculate']")
	WebElement calculatebutton;
	@FindBy(xpath="//input[@id='bmi']")
	WebElement bmitextbox;
	@FindBy(xpath="//input[@id='bmi_category']")
	WebElement bmicategory;

	public Bmicalculator() {
		PageFactory.initElements(driver, this);
	}
public void bmicalculator() throws InterruptedException
{
	if(validation.IsElementPresent(driver, "//input[@id='heightCMS']"))
	{
	enterheighttextbox.sendKeys("152");
	
	}
	else
	{
		System.out.println("Enter height text box is not present");
		
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//input[@id='weightKg']"))
	{
		enterweighttextbox.sendKeys("80");
	}
	else
	{
		System.out.println("Enter weight text box not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//input[@id='Calculate']"))
	{
		calculatebutton.click();
		
	}
	else
	{
		System.out.println("Calculate button not present");
		driver.quit();
	}
	
	System.out.println("Result's");
      System.out.println("Your BMI is : " +bmitextbox.getAttribute("value"));
      System.out.println("Your are in: "+bmicategory.getAttribute("value")+" category");
	
	
	
}
}

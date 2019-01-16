package com.wordpress.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;

public class Signup extends Testbase
{
	Homepage homepage=new Homepage();
	Validation validation =new Validation();
@FindBy(xpath="//input[@id='email']")
WebElement enteremail;

@FindBy(xpath="//input[@id='username']")
WebElement enterusername;

@FindBy(xpath="//input[@id='password']")
WebElement enterpassword;

@FindBy(xpath="//button[@class='button signup-form__submit form-button is-primary']")
WebElement firstcontinuebutton;

@FindBy(xpath="//input[@id='siteTitle']")
WebElement settitle;

@FindBy(xpath="//input[@id='siteTopic']")
WebElement settopic;

@FindBy(xpath="//span[contains(text(),'Share ideas, experiences, updates, reviews, stories, videos, or photos')]/preceding-sibling::input[@id='share']")
WebElement aboutcheckbox;

@FindBy(xpath="//button[@class='button is-primary']")
WebElement Secondcontinuebutton;

@FindBy(xpath="//div[@class='search__input-fade ltr']/input[@aria-label='Search']")
WebElement searchfordomainavailability;

@FindBy(xpath="//span[contains(text(),'Free')]/parent::div[@class='domain-product-price']/parent::div/parent::div/button")
WebElement selectfreeoptionbutton;

@FindBy(xpath="//table[@class='plan-features__table has-4-cols']//button[contains(text(),'Start with Free')]")
WebElement startwithfreebutton;

@FindBy(xpath="//span[contains(text(),'Log In')]/parent::a")
WebElement loginbutton;


public Signup( )
{
	
	PageFactory.initElements(driver, this);
}
public  void signuptitle()
{
	driver.getTitle();
}
public Homepage  Register(String email,String Username) throws InterruptedException
{
	
	
	boolean elementstatus;
	
	if(validation.IsElementPresent(driver,"//input[@id='email']")==true)
	{
	enteremail.sendKeys(email);
	}
	else
	{
		System.out.println("Email field not Displayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//input[@id='username']" )==true)
	{
	enterusername.sendKeys(Username);
	}
	else
	{
		System.out.println("Username text box not didplayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//input[@id='password']" )==true)
	{
	enterpassword.sendKeys("Vidyut@1234");
	}
	else
	{
		System.out.println("Password text box not displayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[@class='button signup-form__submit form-button is-primary']")==true)
	{
		
	
	firstcontinuebutton.click();
	}
	else
	{
		System.out.println("First continue button not displayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//input[@id='siteTitle']")==true)
	{
	settitle.sendKeys("John's Blog");
	}
	else
	{
		System.out.println("Set title box not displayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//input[@id='siteTopic']" )==true)
	{
	settopic.sendKeys("Travel");
	}
	else
	{
		System.out.println("Topic drop down not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Share ideas, experiences, updates, reviews, stories, videos, or photos')]/preceding-sibling::input[@id='share']")==true)
		
	{
		aboutcheckbox.click();
	}
	else
	{
		System.out.println("about check box not displayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[@class='button is-primary']")==true)
	{
	Secondcontinuebutton.click();
	}
	else
	{
		System.out.println("Second continue button not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//div[@class='search__input-fade ltr']/input[@aria-label='Search']")==true)
	{
	searchfordomainavailability.sendKeys("John's travel Blog");
	}
	else
	{
		System.out.println("Domain availability search text box not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//span[contains(text(),'Free')]/parent::div[@class='domain-product-price']/parent::div/parent::div/button")==true)
	{
	selectfreeoptionbutton.click();
	}
	else
	{
		System.out.println("Free option button is not available");
		driver.quit();
	}
	
	if(validation.IsElementPresent(driver, "//table[@class='plan-features__table has-4-cols']//button[contains(text(),'Start with Free')]")==true)
	{
		startwithfreebutton.click();
		
	}
	else
	{
		System.out.println("start with free element is not present");
		driver.quit();
	}
	

	return new Homepage();
	
	}
public Loginpage clickonliginbutton()
{
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Log In')]/parent::a"))
	{	
	loginbutton.click();
	System.out.println("Login button clicked");
	}
	else
	{
		System.out.println("Not redirected to login page");
		driver.quit();
		
	}
	
	
	return new Loginpage();
	
	
	
}


}

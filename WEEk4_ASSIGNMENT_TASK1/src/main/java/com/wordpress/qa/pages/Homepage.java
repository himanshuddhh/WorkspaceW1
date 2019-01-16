package com.wordpress.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;

public class Homepage extends Testbase
{
	Validation validation=new Validation();
	@FindBy(xpath="//a[@class='masterbar__item masterbar__item-me']")
	WebElement profilelink;

	@FindBy(xpath="//button[@class='button sidebar__me-signout-button is-compact']")
	WebElement logout;
	
	@FindBy(xpath="//span[contains(text(),'My Site')]/ancestor::a")
	WebElement manageposts;
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout()
	{

		if(validation.IsElementPresent(driver,"//a[@class='masterbar__item masterbar__item-me']"))
		{
			profilelink.click();
		}
		else
		{
			System.out.println("Profile link not clicked");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//button[@class='button sidebar__me-signout-button is-compact']"))
		{
			logout.click();	
			System.out.println(" logged out");
			}
		else
		{
			System.out.println("Logout button not clicked");
			driver.quit();
		}
	}
	
	public Manageposts gotomanageposts()
	{
		if(validation.IsElementPresent(driver, "//span[contains(text(),'My Site')]/ancestor::a"))
		{
			manageposts.click();
			System.out.println("redirected to Manage posts");
			
			}
		else
		{
			System.out.println("Manage posts not displayed");
			driver.quit();
		}
		
		return new Manageposts();
	}
}

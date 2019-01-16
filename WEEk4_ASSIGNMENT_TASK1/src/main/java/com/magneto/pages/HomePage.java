package com.magneto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class HomePage extends Testbase
{
	Validation validation=new Validation();
	@FindBy(xpath="//a[contains(text(),'Community')]//ancestor::div[@class='more-item']//a[contains(text(),'Manage')]")
	WebElement communitymanagelink;
	@FindBy(xpath="//button[@class='lia-slide-menu-trigger lia-slide-out-nav-menu-wrapper']")
	WebElement menu_btn;
	@FindBy(xpath="//span[contains(text(),'Core Technology - Magento 2')]//ancestor::li")
	WebElement Core_Technology_Magento_2_link;
	@FindBy(xpath="//li[@class='lia-type-forum lia-nav-magento-2-theming lia-nav-item']/a")
	WebElement magento_2_theming_Ques_link;
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public Manageforums navigatetomanageforums()
	{
	
	if(validation.IsElementPresent(driver, "//a[contains(text(),'Community')]//ancestor::div[@class='more-item']//a[contains(text(),'Manage')]"))
	{
		communitymanagelink.click();
	}
	else
	{
		System.out.println("Community manage link not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[@class='lia-slide-menu-trigger lia-slide-out-nav-menu-wrapper']"))
	{
		menu_btn.click();
	}
	else
	{
		System.out.println("Menu button is not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Core Technology - Magento 2')]//ancestor::li"))
	{
		Core_Technology_Magento_2_link.click();
	}
	else
	{
		System.out.println("Core Technology - Magento 2 link isnot present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//li[@class='lia-type-forum lia-nav-magento-2-theming lia-nav-item']/a"))
	{
		magento_2_theming_Ques_link.click();
		System.out.println("Navaigated to forums page");
	}
	else
	{
		System.out.println("magento 2 theming Quesetionlink is not present");
		driver.quit();
	}
	
	
	
		
		return new Manageforums();
		
		
	}//end of method

}//end of HomePage class

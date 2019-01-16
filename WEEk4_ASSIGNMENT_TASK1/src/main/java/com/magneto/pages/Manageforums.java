package com.magneto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Validation;

public class Manageforums extends Testbase
{
	Validation validation=new Validation();
	@FindBy(xpath="//span[@class='lia-button-wrapper lia-button-wrapper-primary lia-component-primary-post-button']//a")
	WebElement starttopic_btn;
	@FindBy(xpath="//input[@id='lia-subject']")
	WebElement entertitletextbox;
	@FindBy(xpath="//body[@id='tinymce']")
	WebElement bodytextbox;
	@FindBy(xpath="//input[@class='lia-button lia-button-primary lia-button-Submit-action']")
	WebElement post_btn;
	@FindBy(xpath="//a[contains(text(),'magento1')]")
	WebElement magnetotag;
	@FindBy(xpath="//a[contains(text(),'CE 2.0')]")
	WebElement CE_2__0_tag;
	public Manageforums() {
		PageFactory.initElements(driver, this);
	}
	public void startatopic()
	{
		if(validation.IsElementPresent(driver, "//span[@class='lia-button-wrapper lia-button-wrapper-primary lia-component-primary-post-button']//a"))
		{
			starttopic_btn.click();
		}
		else
		{
			System.out.println("Start topic button is not displayed");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//input[@id='lia-subject']"))
		{
			entertitletextbox.sendKeys("How can I change the order of the product on the home page?");
		}
		else
		{
			System.out.println("Title text box not present");
		}

		if(validation.IsElementPresent(driver, "//a[contains(text(),'magento1')]"))
		{
			magnetotag.click();
		}
		else
		{
			System.out.println("magnetotag1 not present");
			driver.quit();
		}
		if(validation.IsElementPresent(driver, "//a[contains(text(),'CE 2.0')]"))
		{
			CE_2__0_tag.click();
		}
		else
		{
			System.out.println("CE 2.0 tag is not present");
			driver.quit();
		}
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tinyMceEditor_ifr']")));
		
		if(validation.IsElementPresent(driver, "//body[@id='tinymce']"))
		{
			bodytextbox.sendKeys("I want to change the positions of the products on the homepage.");
		}
		else
		{
			System.out.println("Body text box is not present");
			driver.quit();
		}
		driver.switchTo().defaultContent();
		
		
		if(validation.IsElementPresent(driver, "//input[@class='lia-button lia-button-primary lia-button-Submit-action']"))
		{
			post_btn.click();
			if(driver.findElement(By.xpath("//h2[@class='PageTitle lia-component-common-widget-page-title']/span")).getText().contains("How can I change the order of the product on the home page?"))
			{
				System.out.println("Posted sucessfully");
			}
			else
			{
				System.out.println("Post not postedsucessfully");
			}
		}
		else
		{
			System.out.println("Post button is not present");
			driver.quit();
		}
		
	
		
	}

}

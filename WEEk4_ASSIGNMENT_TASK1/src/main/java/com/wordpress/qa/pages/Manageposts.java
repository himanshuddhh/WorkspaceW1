package com.wordpress.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.qa.base.Testbase;

public class Manageposts extends Testbase
{
	Validation validation=new Validation();
@FindBy(xpath="//span[contains(text(),'My Site')]/ancestor::a")
WebElement Mysite_Btn;
@FindBy(xpath="//span[contains(text(),'Blog Posts')]/ancestor::a")
WebElement blogsbutton;
@FindBy(xpath="//li[@class='is-selected section-nav-tab']//span[@class='count']")
WebElement publishedpostcount;
@FindBy(xpath="//div[@class='post-actions-ellipsis-menu']")
WebElement post_actions;
@FindBy(xpath="//button[contains(text(),'Trash')]")
WebElement delete_button;
@FindBy(xpath="//a[contains(text(),'Edit')]")
WebElement editbutton;
@FindBy(xpath="//body[@id='tinymce']")
WebElement edittextbox;
@FindBy(xpath="//div[@class='editor-ground-control__publish-button']//button[contains(text(),'Update')]")
WebElement updatebutton;
@FindBy(xpath="//button[contains(text(),'Close')]")
WebElement closebutton;
@FindBy(xpath="(//*[@class='gridicon gridicons-ellipsis ellipsis-menu__toggle-icon'])[1]")
WebElement togglebutton;
@FindBy(xpath="//span[contains(text(),'Blog Posts')]//ancestor::a//following-sibling::a[contains(text(),'Add')]")
WebElement addblogbutton;
@FindBy(xpath="//div[@class='editor-title']/textarea")
WebElement entertitletextbox;
@FindBy(xpath="//button[contains(text(),'Publish…')]")
WebElement publishbutton;
@FindBy(xpath="//button[contains(text(),'Publish')]")
WebElement secondpublishbutton;
@FindBy(xpath="//button[@class='button web-preview__close is-borderless']")
WebElement addpostclosebutton;
public Manageposts() {
	PageFactory.initElements(driver,this);
}
public void deletepost() throws InterruptedException
{
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Blog Posts')]/ancestor::a"))
	{
		blogsbutton.click();
	}
	else
	{
		System.out.println("Blog's Button not displayed");
		driver.quit();
	}
	Thread.sleep(3000);
	if(validation.IsElementPresent(driver, "(//*[@class='gridicon gridicons-ellipsis ellipsis-menu__toggle-icon'])[1]"))
	{
		togglebutton.click();
	}
	else
	{
		System.out.println("Toggle button not present");
		driver.quit();
	}
	
	
	
	
	if(validation.IsElementPresent(driver, "//button[contains(text(),'Trash')]"))
	{
		String beforedeletecount=publishedpostcount.getText();
		 int beforedelete =Integer.parseInt(beforedeletecount);
		delete_button.click();
		String afterdeletecount=publishedpostcount.getText();
		int afterdelete =Integer.parseInt(afterdeletecount);
		if(beforedelete>afterdelete)
		{
			System.out.println("Post deleted sucessfully");
			
		}
		
		
	}
	else
	{
		System.out.println("Delete post button not displayed and post not deleted");
		driver.quit();
	}
	
}
public void postcount()
{
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Blog Posts')]/ancestor::a"))
	{
		blogsbutton.click();
	}
	else
	{
		System.out.println("Blog's Button not displayed");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//li[@class='is-selected section-nav-tab']//span[@class='count']"))
	{
		String s=publishedpostcount.getText();
		System.out.println("Number of published post's"+" "+s);
		
	}
	else
	{
		System.out.println("Published posts not displayed");
		driver.quit();
	}
}
public void editpost() throws InterruptedException
{

	if(validation.IsElementPresent(driver, "//span[contains(text(),'Blog Posts')]/ancestor::a"))
	{
		blogsbutton.click();
	}
	else
	{
		System.out.println("Blog's Button not displayed");
		driver.quit();
	}
	Thread.sleep(2000);
	if(validation.IsElementPresent(driver, "(//*[@class='gridicon gridicons-ellipsis ellipsis-menu__toggle-icon'])[1]"))
	{
		togglebutton.click();
	}
	else
	{
		System.out.println("Toggle button not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver,"//a[contains(text(),'Edit')]"))
	{
		editbutton.click();
		
			}
	else
	{
		System.out.println("Edit button not present");
		driver.quit();
		
	}
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id,'tinymce')]")));
	if(validation.IsElementPresent(driver, "//body[@id='tinymce']"))
	{
		edittextbox.click();
		edittextbox.sendKeys("  This blog is edited");
		System.out.println("Blog Edited sucessfully");
	}
	else
	{
		System.out.println("Blog is not edited");
		driver.quit();
	}
	driver.switchTo().defaultContent();
	if(validation.IsElementPresent(driver, "//div[@class='editor-ground-control__publish-button']//button[contains(text(),'Update')]"))
	{
		updatebutton.click();
	}
	else
	{
		System.out.println("Update button not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[contains(text(),'Close')]"))
	{
		closebutton.click();
	}
	else
	{
		System.out.println("closebutton not present");
		driver.quit();
	}
	
}
public void addpost() throws InterruptedException
{
	if(validation.IsElementPresent(driver, "//span[contains(text(),'Blog Posts')]//ancestor::a//following-sibling::a[contains(text(),'Add')]"))
	{
		addblogbutton.click();
	}
	else
	{
		System.out.println("Add Blog button not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//div[@class='editor-title']/textarea"))
	{
		entertitletextbox.sendKeys("First Blog");
	}
	else
	{
		System.out.println("Enter title text box not present");
		driver.quit();
	}
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@id,'tinymce')]")));
	
	if(validation.IsElementPresent(driver, "//body[@id='tinymce']"))
	{
		edittextbox.click();
		edittextbox.sendKeys("My Blog");
		
	}
	else
	{
		System.out.println("Blog Text area not present");
		driver.quit();
	}

	driver.switchTo().defaultContent();
	if(validation.IsElementPresent(driver, "//button[contains(text(),'Publish…')]"))
	{
		publishbutton.click();
	}
	else
	{
		System.out.println("Update button not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[contains(text(),'Publish')]"))
	{
		secondpublishbutton.click();
	}
	else
	{
		System.out.println("Second publish button not present");
		driver.quit();
	}
	if(validation.IsElementPresent(driver, "//button[@class='button web-preview__close is-borderless']"))
	{
		addpostclosebutton.click();
		System.out.println("Published post sucesfully");
	}
	
	else
	{
		System.out.println("close button not present");
		driver.quit();
	}
	
	
	
}
 
}

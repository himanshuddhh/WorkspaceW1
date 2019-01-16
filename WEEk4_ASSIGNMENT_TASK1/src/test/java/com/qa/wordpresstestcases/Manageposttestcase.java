package com.qa.wordpresstestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Homepage;
import com.wordpress.qa.pages.Loginpage;
import com.wordpress.qa.pages.Manageposts;
import com.wordpress.qa.pages.Signup;

public class Manageposttestcase extends Testbase
{
	Loginpage loginpage;
	Signup signup;
	Homepage homepage;
	Manageposts managepost;
	public Manageposttestcase()
	{
		super();
		
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		driver.get("https://wordpress.com/start/domains");
		signup =new Signup();
		loginpage=signup.clickonliginbutton();
		homepage=loginpage.login("Himanshud222","Vidyut@1234");
		managepost=homepage.gotomanageposts();
	
		
	}
	@Test(priority=3)
	public void deletetest() throws InterruptedException
	{
		managepost.deletepost();
	}
	@Test(priority=4)
	public void counttest()
	{
		managepost.postcount();
	}
	@Test(priority=2)
	public void editpost() throws InterruptedException
	{
		managepost.editpost();
		
	}
	@Test(priority=1)
	public void publishpost() throws InterruptedException
	{
		managepost.addpost();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

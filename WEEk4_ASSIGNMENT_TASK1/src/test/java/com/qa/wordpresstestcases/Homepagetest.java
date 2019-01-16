package com.qa.wordpresstestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Homepage;
import com.wordpress.qa.pages.Loginpage;
import com.wordpress.qa.pages.Manageposts;
import com.wordpress.qa.pages.Signup;

public class Homepagetest extends Testbase
{
	Loginpage login;
	Signup signup;
	Homepage homepage;
	public Homepagetest() {
		super();
	}
	@BeforeMethod
	public void setup()
	{
		Testbase.initialization();
		driver.get("https://wordpress.com/start/domains");
		signup=new Signup();
		
		login=signup.clickonliginbutton();
	homepage=login.login("Himanshud222","Vidyut@1234");
        
	    
	    
	}
	@Test(priority=1)
	public void mangepostredirectiontest() throws InterruptedException
	{
		Manageposts manage=homepage.gotomanageposts();
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void logouttest()
	{
		homepage.logout();
	}
	
@AfterMethod
public void teardown()
{
	
	driver.close();
}
	}



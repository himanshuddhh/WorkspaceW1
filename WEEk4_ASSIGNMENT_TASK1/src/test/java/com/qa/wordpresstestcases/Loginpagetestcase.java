package com.qa.wordpresstestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Homepage;
import com.wordpress.qa.pages.Loginpage;
import com.wordpress.qa.pages.Signup;

public class Loginpagetestcase extends Testbase
{
public Loginpagetestcase() 
{
	super();
}
Loginpage loginpage;
Signup signup;
@BeforeMethod
public void setup()
{
	initialization();
	driver.get("https://wordpress.com/start/domains");
	signup =new Signup();
	loginpage=signup.clickonliginbutton();
	
	}
@Test
public void login()
{
	Homepage hompage=loginpage.login("Himanshud222","Vidyut@1234");
	if(hompage!=null)
	{
		System.out.println("Login sucessful");
	}
	else
	{
		System.out.println("Login failed");
	}
}
@AfterMethod
public void teardown()
{
	driver.quit();
	
}

}

package com.qa.wordpresstestcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Homepage;
import com.wordpress.qa.pages.Loginpage;
import com.wordpress.qa.pages.Signup;
import com.wordpress.qa.pages.Validation;

import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class SignUpPagetestcase extends Testbase 
{
	int x = ((int)(Math.random() * 100000)) % 1000;
	int y = ((int)(Math.random() * 100000)) % 10000;
	String email="himanshud"+x+"@gmail.com";
	String username="himanshud"+y;
	Loginpage loginpage;
	Signup signup;
	Homepage homepage;
	Validation validation=new Validation();
	public SignUpPagetestcase()
	{
	super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		driver.get("https://wordpress.com/start/domains");
		 signup=new Signup();
	}
	
	
	@Test(priority=1)
	public void testsignup() throws InterruptedException
	{
		
	homepage=signup.Register(email,username);
	
	System.out.println("Sucessfully Registered");
	System.out.println("logging out");
	
	homepage.logout();
	
	}
	
	@Test(priority=0)
	public void loginclick()
	{
		signup.clickonliginbutton();
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}

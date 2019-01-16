package com.magneto.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magneto.pages.HomePage;
import com.magneto.pages.LoginorsignUppage;
import com.magneto.pages.Productspage;
import com.wordpress.qa.base.Testbase;
import com.wordpress.qa.pages.Signup;

public class Homepagetest extends Testbase
{
	Productspage productspage;
	LoginorsignUppage loginpage;
	HomePage homepage;
	public Homepagetest() 
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		driver.get("https://magento.com/products/magento-open-source");
		productspage=new Productspage();
		loginpage=productspage.navigatetologin_or_signup();
		homepage=loginpage.login("himanshuddhh@gmail.com","Vidyut@123");
	}
	@Test(priority=1)
	public void testnavigatetomanageforums()
	{
		homepage.navigatetomanageforums();
	}
	
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}

package com.magneto.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magneto.pages.HomePage;
import com.magneto.pages.LoginorsignUppage;
import com.magneto.pages.Manageforums;
import com.magneto.pages.Productspage;
import com.wordpress.qa.base.Testbase;

public class Manageforumstest extends Testbase 
{
	Productspage productspage;
	LoginorsignUppage loginpage;
	HomePage homepage;
	Manageforums manageforums;
	public Manageforumstest() 
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
		manageforums=homepage.navigatetomanageforums();
	}
	@Test
	public void teststartatopic()
	{
		manageforums.startatopic();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	

}

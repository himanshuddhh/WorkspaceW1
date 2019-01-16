package com.magneto.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magneto.pages.LoginorsignUppage;
import com.magneto.pages.Productspage;
import com.wordpress.qa.base.Testbase;

public class LoginorSignuppagetest extends Testbase
{
	LoginorsignUppage loginpage;
	Productspage productpage;
public LoginorSignuppagetest()
{
	super();
}	
@BeforeMethod
public void setup()
{
	initialization();
	driver.get("https://magento.com/products/magento-open-source");
	productpage=new Productspage();
	loginpage=productpage.navigatetologin_or_signup();
	
	}
@Test
public void registrationbuttonclicktest()
{
	loginpage.clickonregisterbutton();
	System.out.println("Redirected to resistration page");
}
@Test(priority=1)
public void testlogin()
{
	loginpage.login("himanshuddhh@gmail.com","Vidyut@123");
	System.out.println("Logged in");
	
	
}


@AfterMethod
public void teardown()
{
	driver.quit();
}

}

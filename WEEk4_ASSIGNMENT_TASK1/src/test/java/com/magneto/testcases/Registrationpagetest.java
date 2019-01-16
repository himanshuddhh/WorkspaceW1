package com.magneto.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magneto.pages.LoginorsignUppage;
import com.magneto.pages.Productspage;
import com.magneto.pages.Registrationpage;
import com.wordpress.qa.base.Testbase;

public class Registrationpagetest extends Testbase
{
	LoginorsignUppage loginpage;
	Productspage productpage;
	Registrationpage registrationpage;
public Registrationpagetest() 
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
	registrationpage=loginpage.clickonregisterbutton();
}
//@Test
public void registrationtest()
{
	registrationpage.registration();
}
@AfterMethod
public void teardown()
{
	driver.quit();
}

}

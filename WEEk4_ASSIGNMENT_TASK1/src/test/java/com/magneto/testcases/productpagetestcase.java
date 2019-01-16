package com.magneto.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.magneto.pages.Productspage;
import com.wordpress.qa.base.Testbase;

public class productpagetestcase extends Testbase
{
	Productspage productspage;
public productpagetestcase() {
	super();
}
@BeforeMethod
public void setup()
{
	initialization();
	driver.get("https://magento.com/products/magento-open-source");
	productspage=new Productspage();
	
}
@Test
public void tetnavigatetologin_or_signup()
{
	productspage.navigatetologin_or_signup();
}
@AfterMethod
public void teardown()
{
	driver.quit();
}
}

package com.qa.bmicalculatortestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bmcalculator.qa.pages.Bmicalculator;
import com.bmcalculator.qa.pages.Loginpage;
import com.wordpress.qa.base.Testbase;

public class BMIcalculatortest extends Testbase
{
	Bmicalculator bmicalculator;
	Loginpage loginpage;
	public BMIcalculatortest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		driver.get("http://elearning.infogain.com:8383/moodle/pluginfile.php/838/mod_assign/intro/bmicalculator.html");
		loginpage=new Loginpage();
		bmicalculator=loginpage.login("himanshu.dixit@infogain.com","Krishna@210995");
	
	
	}
	@Test
	public void testbmicalculator() throws InterruptedException
	{
		bmicalculator.bmicalculator();
	}
   @AfterMethod
    public void teardown()
   {
	driver.quit();
   }
}

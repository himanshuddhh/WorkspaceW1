package com.qa.bmicalculatortestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bmcalculator.qa.pages.Loginpage;
import com.wordpress.qa.base.Testbase;

public class Loginpagetest extends Testbase
{
	Loginpage loginpage;
	public Loginpagetest() {
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		driver.get("http://elearning.infogain.com:8383/moodle/pluginfile.php/838/mod_assign/intro/bmicalculator.html");
		loginpage=new Loginpage();
	}
	@Test
	public void testlogin()
	{
		loginpage.login("himanshu.dixit@infogain.com","Krishna@210995");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();;
	}

}

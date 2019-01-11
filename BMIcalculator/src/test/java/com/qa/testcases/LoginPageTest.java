package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;



public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		driver.get("http://elearning.infogain.com:8383/moodle/pluginfile.php/838/mod_assign/intro/bmicalculator.html");
		loginPage=new LoginPage();
	}
	@Test
	public void testlogin() throws IOException
	{
		loginPage.login("himanshu.dixit@infogain.com","Krishna@210995");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();;
	}

	
	
	
	
	
	
}//end of class

package com.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.BMICalculator;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

public class BMICalculatorTest extends TestBase{
	
	LoginPage loginPage;

	public BMICalculatorTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	BMICalculator bmiCalculator;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		driver.get("http://elearning.infogain.com:8383/moodle/pluginfile.php/838/mod_assign/intro/bmicalculator.html");
		loginPage=new LoginPage();
		bmiCalculator=loginPage.login("himanshu.dixit@infogain.com","Krishna@210995");
	
		
	
	}
	@Test
	public void testbmicalculator() throws InterruptedException
	{
		bmiCalculator.calculateBMI("150", "89");
	}
   
	
	@AfterMethod
    public void teardown()
   {
	driver.quit();
   }
	
	
	
	
	
	
	
}//end of class

package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class BMICalculator extends TestBase{

	public BMICalculator() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id='heightCMS']")
	WebElement height;
	
	@FindBy(xpath="//*[@id='weightKg']")
	WebElement weight;
	
	@FindBy(xpath="//*[@id='Calculate']")
	WebElement calculate;
	
	@FindBy(xpath="//*[@id='bmi']")
	WebElement showBMI;
	
	@FindBy(xpath="//*[@id='bmi_category']")
	WebElement showCategory;
	
	
	public void calculateBMI(String height1,String weight1) throws InterruptedException
	{
		height.sendKeys(height1);
		
		Thread.sleep(2000);
		weight.sendKeys(weight1);
		Thread.sleep(2000);
		calculate.click();
		
		System.out.println("Your BMI is-->"+showBMI.getAttribute("value"));
		System.out.println("You are in "+showCategory.getAttribute("value")+" category");
		
		
		
	}//end of method

}

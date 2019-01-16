package com.wordpress.qa.pages;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wordpress.qa.base.Testbase;

public class Validation  extends Testbase
{
	int count=0;
	boolean b;
	
	 public boolean IsElementPresent(WebDriver driver, String xpath)
	    {
		
		
		 try{
			 WebDriverWait wait=new WebDriverWait(driver, 300);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		 }
		 catch(Exception e){
			 if(count<1)
			  {
				 count++;
				  IsElementPresent(driver, xpath);
				  
			  }
		 }
		  

		  if(driver.findElements(By.xpath(xpath)).size() >0 && count<2)
		  {
			  b=true;
			  return b;
		  }
		  
			  return false;
		  }
			  
	            
	            
	  
		
	}  



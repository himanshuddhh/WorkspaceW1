package com.wordpress.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public  class Testbase
{

	public static WebDriver driver;
	public static Properties prop;
	public Testbase()
	{
		try {
			prop=new Properties();
			FileInputStream fi=new FileInputStream ("C:/Users/himanshu.dixit/Downloads/WEEk4_ASSIGNMENT_TASK1/WEEk4_ASSIGNMENT_TASK1/src/main/java/com/wordpress/qa/config/config.properties");
			prop.load(fi);
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			}
		
		
	}
	public static  void initialization()
	{
		String browsername =prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{

			  System.setProperty("webdriver.chrome.driver", "D:/selenium_drivers/new/chromedriver.exe");
			  driver=new ChromeDriver();
			  
		}
		else if(browsername.equals("FF"))
		{

			 driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		
		
		
		
	}
	
}

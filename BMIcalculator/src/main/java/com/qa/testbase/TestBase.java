package com.qa.testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() throws IOException {
		/*prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/himanshu.dixit/w1/AssignmentQNO2/src/main/java/com/qa/config/config.properties");
		prop.load(ip);*/

	}

	public static void initialization() {
		//String browser = prop.getProperty("browser");
		
			System.setProperty("webdriver.chrome.driver","D:/selenium_drivers/new/chromedriver.exe");
			driver = new ChromeDriver();
		

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));

	}


}

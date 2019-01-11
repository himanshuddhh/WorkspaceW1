package QuestionNo2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MakeMyTrip {
	
	public static void main(String[] args) throws InterruptedException {
		
		String driverLocation = "D:/selenium_drivers/new/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com");
		driver.findElement(By.id("hp-widget__sfrom")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='js-filterOptins']//li[@aria-label='Top Cities : New Delhi, India ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@ id='js-filterOptins']//*[@ class='locationFilter autocomplete_to']//li[@ aria-label='Top Cities : Bangalore, India ']")).click();
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@class,'ui-datepicker-week-end')]//a[contains(text(),'1')][1]")).click();
		screenshotFolder(driver, "image");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='aln_G8_dep']//span[contains(@class,'checkbox_state pull-right')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		screenshotFolder(driver, "image");
			
	}//end of main
	
	public static void screenshotFolder(WebDriver driver,String Screenshot)
		{
		  
		try {
			int i=(int) (Math.random()*100);	
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(source,new File("./WebScreenshots/"+Screenshot+i+".png"));
			i++;
			System.out.println("Screenshot is taken");
			} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Screenshot has not taken");
			
			}//end of method screenshot
	 
	 }//end of method

}//end of class



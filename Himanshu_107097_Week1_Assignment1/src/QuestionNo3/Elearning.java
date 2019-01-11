package QuestionNo3;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elearning {
	
	public static void main(String[] args) throws InterruptedException {
	
		String driverLocation = "D:/selenium_drivers/new/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://elearning.infogain.com:8383/moodle/");
		System.out.println("<------------successfully setup the browser-------------->");
		
		WebElement webElement=driver.findElement(By.partialLinkText("Courses"));
		webElement.click();
		
		webElement=driver.findElement(By.partialLinkText("Log in"));
		webElement.click();
		driver.findElement(By.name("username")).sendKeys("himanshu.dixit@infogain.com");
		
		driver.findElement(By.name("password")).sendKeys("Krishna@210995");
		
		driver.findElement(By.id("loginbtn")).click();
		System.out.println("-------------successfully logged in---------------");

		driver.findElement(By.partialLinkText("Infogain Certified Automation Testing Using Seleni...")).click();
		System.out.println("<-------------clicking on to the course----------->");

		driver.findElement(By.partialLinkText("Automation Testing Using Selenium Web Driver Part 5 _Video")).click();
		
    	
		driver.findElement(By.className("vjs-big-play-button")).click();
		Thread.sleep(3000);
		System.out.println("--------------successfullyy played a video---------");

		driver.findElement(By.partialLinkText("Log out")).click();
		System.out.println("<-----------------Successfully Logout---------------->");

			driver.quit();
		
		
}

}//end of class Elearning

package QuestionNo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	
public static void main(String[] args) throws InterruptedException {
		
		String driverLocation = "D:/selenium_drivers/new/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		driver.get("http://bookmyshow.com");
		WebElement webElement=driver.findElement(By.partialLinkText("NCR"));
		webElement.click();
		Thread.sleep(5000);
		WebElement webElement2=driver.findElement(By.partialLinkText("Movies"));
		webElement2.click();
				
	}//end of main method

}//end of class BookMyShow

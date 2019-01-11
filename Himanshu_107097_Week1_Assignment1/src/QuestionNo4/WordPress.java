package QuestionNo4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class WordPress {
	
	public static void main(String[] args) throws InterruptedException{
		
		String driverLocation = "D:/selenium_drivers/new/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		
		ChromeDriverService.Builder builder=new ChromeDriverService.Builder();
		ChromeDriverService srvc=builder.usingDriverExecutable(new File(driverLocation)).usingPort(29093).build();
		try {
			srvc.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriver driver=new ChromeDriver(srvc);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		 driver.get("https://wordpress.com/start/domains");
		
		 System.out.println("<---------------Starting of registration(CODE IS INSIDE COMMENT)----------------->");
		 
		 /*  WebElement e = driver.findElement(By.name("email"));
		  e.sendKeys("himanshud2222@gmail.com");
		  WebElement e1 = driver.findElement(By.name("username"));
		  e1.sendKeys("Himanshud222");
		  WebElement e2 = driver.findElement(By.name("password"));
		  e2.sendKeys("Vidyut@1234");
		  e1.submit();
		  driver.findElement(By.partialLinkText("Log in")).click();
		  WebElement e3 = driver.findElement(By.name("usernameOrEmail"));
		  e3.sendKeys("aditibhagi@gmail.com");
		  WebElement e4 = driver.findElement(By.className("button form-button is-primary"));
		  e4.click();
		  driver.findElement(By.partialLinkText("Log out"));
		  Thread.sleep(3000);
		  */
		 System.out.println("------------------Registration is Done-------------------");
		
		 
		 System.out.println("<-----------------Login once again to the site for writing post(CODE IS INSIDE COMMENT)---------->");
		
		 driver.navigate().to("https://wordpress.com/start/domains");
		 driver.findElement(By.partialLinkText("Log In")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='usernameOrEmail']")).sendKeys("Himanshud222");
		 
		driver.findElement(By.xpath("//button[contains(.,'Continue')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Vidyut@1234");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(.,'Log In')]")).click();
		Thread.sleep(2000);
		
		System.out.println("<-------------------Login has done--------------------->");
		
		
		System.out.println("<----------------Writing a post(CODE IS INSIDE COMMENT)---------->");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/a")).click();
		
		System.out.println("<---------------Filling information for writing the post(CODE IS INSIDE COMMENT)----------->");
		/*driver.findElement(By.xpath("//*[@id='siteTitle']")).sendKeys("HD Blog");
		driver.findElement(By.xpath("//*[@id='siteTopic']")).sendKeys("Technology");
		driver.findElement(By.xpath("//*[@id='educate']")).click();
		driver.findElement(By.xpath("//div[@class='about__submit-wrapper']//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'search__input-fade ltr')]//input[contains(@class,'search__input ltr')]")).sendKeys("http://techhdpress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'domain-suggestion__content')]//*[contains(text(),'techhdpress.wordpress.com')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Start with Free')]")).click();
		*/
		System.out.println("<------------Information has got filled----------->");
		
		
		
		
		System.out.println("------------------Filling fields for writing post(CODE IS INSIDE COMMENT)------------------");
		
		driver.findElement(By.xpath("//textarea[contains(@class,'textarea-autosize editor-title__input')]")).sendKeys("Knowledge");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Striving to attain something");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[contains(text(),'Publish…')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Publish!')]")).click();
		System.out.println("<-------------successfully the post has got published----------");
		
		System.out.println("<---------------Logging out from the Wordpress------------->");
		
		driver.findElement(By.xpath("//div[contains(@class,'web-preview__toolbar')]//*[contains(text(),'Close')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'masterbar__item masterbar__item-me')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
		
		System.out.println("<---------------Logged out from the Wordpress------------->");
		
		driver.quit();
		
		
	
	}//end of main
}//end of class WordPress

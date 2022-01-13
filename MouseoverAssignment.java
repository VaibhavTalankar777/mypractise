package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAssignment {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
       driver.findElement(By.id("signin_button")).click();
		
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		
		//click on checkbox
		 driver.findElement(By.id("user_remember_me")).click();
		 
		 //by name
		 driver.findElement(By.name("submit")).click();
		 
	     
		 //by ID
		  driver.findElement(By.id("details-button")).click();
	      driver.findElement(By.id("proceed-link")).click();
	      //go to My Money Tab
	     driver.findElement(By.xpath("//a[contains(text(),'My Money Map')]")).click();
	     
	   //Create object of Actions Class
			Actions act =new Actions(driver);
			
	      WebElement one =driver.findElement(By.id("ext-sprite-1259"));
	      WebElement two=driver.findElement(By.id("ext-sprite-1257"));
	      WebElement three =driver.findElement(By.id("ext-sprite-1263"));
	    
	     
	    Thread.sleep(1000);
	      act.moveToElement(one).moveToElement(two).moveToElement(three).click().build().perform();
	    
	      driver.close();
	      driver.quit();

	}
	}

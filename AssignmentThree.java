package SeleniumBasics;
/*
 * 
 * @author VaibhavTalankar
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentThree {   

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("http://zero.webappsecurity.com/");
			System.out.println("This assignment is to handle alert in paybills feature");
			
			
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
		      
		      
		      String CurrentUrl= driver.getCurrentUrl();
		      System.out.println(CurrentUrl);
		      
		      driver.findElement(By.xpath("//a[contains(text(),'Pay Bills')]")).click();
		                 //click on pay bills tab
		      
		      driver.findElement(By.xpath("//a[contains(text(),'Purchase Foreign Currency')]")).click();
		                  //click on purchase Foreign currency
		      
		      
		      driver.findElement(By.xpath("//input[@id='purchase_cash']")).click();
		                  //click on purchase cash button
		     
				
				Alert TAlert =driver.switchTo().alert();  //switch to alert from main page
				
				String alerttxt=TAlert.getText();
				
				System.out.println("The alert is "+ alerttxt);
				
				TAlert.getText();
				TAlert.accept();   //// Accept alert on pay bill page

     // WebElement logoutt=driver.findElement(By.xpath("//i[@class='icon-user']"));
				 
				
			//	Select dd=new Select(logoutt);
			//	dd.selectByVisibleText("Logout");
				
				
				
				
//			   Alert Alert =driver.switchTo().alert();
//			   System.out.println("The alert is "+ Alert);
//			   
//			   Thread.sleep(1000);

				
//			  Alert.accept();
//			  Thread.sleep(1000); 
		      
		      driver.close();
		      driver.quit();
	}

}

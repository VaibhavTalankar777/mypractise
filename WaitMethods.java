package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		//Implicit Wait 
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS); //IT WILL WORK TILL WE QUIT BROSWER FOR 7 SECONDs
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.id("signin_button")).click();
		
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		//login in to application
        driver.findElement(By.name("submit")).click();
        
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //IT WILL WORK TILL WE QUIT BROSWER FOR 10 SECOND
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        
        
        
        //// Explicit Wait 
        WebDriverWait ewait =new WebDriverWait(driver, 10);
        ewait.until(ExpectedConditions.titleContains("Zero - Account Summary"));
        
        /// driver close
		driver.close();
		
		//quit browser
		
		driver.quit();
	}

}

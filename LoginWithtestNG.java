package testng;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithtestNG {

	public WebDriver driver;

		//SetUp
	    @BeforeTest
		public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
		//Test ====================
		@Test
		public void LoginTest() {
		//open url 
		driver.get("http://zero.webappsecurity.com/");
		assertEquals(driver.getTitle(),"Zero - Personal Banking - Loans - Credit Cards");
		//Login Tests
        driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		 driver.findElement(By.name("submit")).click();
		  driver.findElement(By.id("details-button")).click();
	      driver.findElement(By.id("proceed-link")).click();
	      assertEquals(driver.getTitle(), "Zero - Account Summary");
		}
		
		
	      // clean up
	      @AfterTest
	      public void cleanUp() {
	      driver.close();
	      driver.quit();
	      }
	

}

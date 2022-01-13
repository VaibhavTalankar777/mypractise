package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class AssertionsAndVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
		
		
		String ExpectedTitle="Zero - Personal Banking - Loans - Credit Cards";
		String ActualTitle=driver.getTitle();
		
	//	if(ActualTitle==ExpectedTitle)
	//	{
	//		System.out.println("pass");
	//	}
	//	else
	//	{
	//		System.out.println("fail");
	//		}
		//=============Assertion=====================//
	 assertEquals(ActualTitle, ExpectedTitle,"Application is down test failed");
		 
		// System.out.println("Test passed");
		 
		
		// ############ Verification ################   Either Method 1==============================//
	        try {
	          String brand = driver.findElement(By.className("brand")).getText();
         assertEquals(brand, "Zero Bank");
	        } catch (AssertionError e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        //Try catch block is more preferrable than below 2nd method 
	        
	        ////////====================Either Method 2  ++++++++++++++++++++++++++++=
 SoftAssert sa=new SoftAssert();
 String brand = driver.findElement(By.className("brand")).getText();
 sa.assertEquals(brand, "Zero Bank +1","Test failed! /n");  //here we take +1 so that test should fail & result displayed in console window
	        
	       // driver.findElement(By.id("searchTerm")).sendKeys("Fund Transfer")
 sa.assertAll();
		driver.close();
		driver.quit();
	}

}

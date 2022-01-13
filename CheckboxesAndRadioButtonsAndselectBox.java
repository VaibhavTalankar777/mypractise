package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxesAndRadioButtonsAndselectBox {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("signin_button")).click();
		
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		//click on checkbox
		WebElement rememberMeCheckbox = driver.findElement(By.id("user_remember_me"));
		
		
		
		
		 boolean rmcIsSelected = rememberMeCheckbox.isSelected();
	        boolean rmcIsdisplyed = rememberMeCheckbox.isDisplayed();
	        boolean rmcIsEnabled = rememberMeCheckbox.isEnabled();

	        if (rmcIsdisplyed) {
	            System.out.println("Checkbox is displyed!");
	            if (rmcIsEnabled) {
	                System.out.println("Checkbox is Enabled");
	                if (rmcIsSelected) {
	                    System.out.println("Checkbox is Selected");                   
	                } else {
	                    rememberMeCheckbox.click();
	                    System.out.println("Checkbox was not checked. I have checked it now!");
	                }
	            } else {
	                System.out.println("Checkbox is not Enabled. Cannot do anything further!");
	            }
	        } else {
	            System.out.println("Checkbox is NOT displyed!!!");
	            
	        }
	        
	        //login in to application
	        driver.findElement(By.name("submit")).click();
	       
	        
	        driver.findElement(By.id("details-button")).click();
	        driver.findElement(By.id("proceed-link")).click();

	        
	        
	        // navigate to pay bill and Purchase Foreign Currency
	     WebElement paybill= driver.findElement(By.linkText("Pay Bills"));
	      
	      //// Explicit Wait 
	        WebDriverWait wait =new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Pay Bills")));
	        paybill.click();
	        
	    WebElement paybillss=driver.findElement(By.linkText("Purchase Foreign Currency"));
	    //    paybillss.isDisplayed();
	    //    paybillss.click();
	       
	        //// Explicit Wait
	        WebDriverWait waittwo =new WebDriverWait(driver, 10);
	        waittwo.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Purchase Foreign Currency")));
	        paybillss.click();
	        
	      //  paybillss.getText();

	        // ########### working with Radio buttons ##############
	        WebElement radiobutton = driver.findElement(By.id("pc_inDollars_false"));

	        boolean drbIsSelected = radiobutton.isSelected();

	        if(!drbIsSelected) {
	            radiobutton.click();
	            System.out.println("Selected currency Redio button was not selected. I have selected now!");
	        }   
	        
	       
	        
	     // ############# Select box #############
	        WebElement currency = driver.findElement(By.id("pc_currency"));
	        Select sel = new Select(currency);

//	        Select sel1 = new Select(driver.findElement(By.id("pc_currency")));
//	        new Select(driver.findElement(By.id("pc_currency"))).selectByVisibleText("Switzerland (franc)");

	        sel.selectByVisibleText("Denmark (krone)");
	        
	        sel.selectByValue("GBP");
	      
	        sel.selectByIndex(4);
	        
	        
		
	//	if(!rmcheckbox)
	//	{
	//		rememberMeCheckbox.click();
	//		System.out.println("Checkbox was not checked I have checked it now");
	//	}
	//	else
	//	{
	//	System.out.println("Checkbox is Already selected");	
	//	}
		
		
		 /// driver close
		driver.close();
		
		//quit browser
		
		driver.quit();
	}

}

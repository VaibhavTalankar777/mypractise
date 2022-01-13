package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndPopus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
		
		//+++++++++++++++++++ALERTS +++++++++++++++++++++++++=
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
		
		
		Alert jsAlert =driver.switchTo().alert();
		
		String alerttext=jsAlert.getText();
		
		System.out.println("The alert is "+ alerttext);
		

		
		jsAlert.accept();
		
assertEquals(driver.findElement(By.id("result")).getText(),"You successfully clicked an alert","Alert Test Failed");
	

////++++++++++++++++++++++++++++=  Confirmation +++++++++++++++++++++++++++++++++++

////////////   Click on OK button on confirmation popup
    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
    Alert jsConfirm =driver.switchTo().alert();
    String Confirmtext= jsConfirm.getText();

    System.out.println("The text on confirm popup is '" + Confirmtext+ "'");
    jsConfirm.accept();
   
    assertEquals(driver.findElement(By.id("result")).getText(),"You clicked: Ok","Confirmation Test Failed");	
    
    
    
    ///////// Click on Cancel button on confirmation popup
     driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
    Alert jsConfirmCancel =driver.switchTo().alert();
    jsConfirmCancel.dismiss();
    
    assertEquals(driver.findElement(By.id("result")).getText(),"You clicked: Cancel","Confirmation Test Failed");
                                                               // [  ,"Confirmation Test Failed" ]  is optional.
    
    
    /////    PROMPT ==========/////
    
 // ##################### Prompt ################
    // Click on OK

    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

    Alert jsPrompt = driver.switchTo().alert();

    System.out.println(jsPrompt.getText());

    jsPrompt.sendKeys("This is a Prompt!");

    
    jsPrompt.accept();

    assertEquals(driver.findElement(By.id("result")).getText(), "You entered: This is a Prompt!", "Prompt test Failed!");

  
    // Click on Cancel
    driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();

    Alert jsPromptCancel = driver.switchTo().alert();

    jsPromptCancel.sendKeys("This is a Prompt!");

   
    jsPromptCancel.dismiss();

    assertEquals(driver.findElement(By.id("result")).getText(), "You entered: null", "Prompt test Failed!");

     
     
		driver.close();
		driver.quit();
		
		
	}

}

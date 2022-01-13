package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframenAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		
		driver.manage().window().maximize();
		
		
		
		////////////working with iframes
	
	     WebElement iframe= driver.findElement(By.id("iframeResult"));
	     driver.switchTo().frame(iframe);
	    
	   //  WebElement iframe1= driver.findElement(By.id("tryhome"));
	  //   driver.switchTo().frame(iframe1);
 	  
	   //   WebElement text=driver.findElement(By.id("textareawrapper"));
	   //   driver.switchTo().frame(text);
	     driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	     
	     
	     Alert alt= driver.switchTo().alert();
	     alt.getText();
	     alt.accept();
	     
	     
	     //click on dismiss button
	   
	     driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	     
	     Alert alt11= driver.switchTo().alert();
	     alt11.getText();
	     alt11.dismiss();
          
	      driver.close();
          driver.quit();

	}

}

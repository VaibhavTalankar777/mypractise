package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			driver.get("http://zero.webappsecurity.com/");
			
			
		
		/////////   LOCATORS     ////////
		
		///By Class name
		//driver.findElement(By.className("search-query")).sendKeys("online banking");
		
		//By ID
		//driver.findElement(By.id("signin_button")).click();
		
		//By name
		//driver.findElement(By.name("user_login")).sendKeys("username");
		//Thread.sleep(2000);
		
		// By Link Text
	//	driver.findElement(By.linkText("Forgot your password ?")).click();
		
		// By  Partial Link Text
		//		driver.findElement(By.linkText("Forgot")).click();
				
		///////  **********CSS SELECTOR **********/////////
			
			//=======By id css = #idvalue
			//driver.findElement(By.cssSelector("#user_login")).sendKeys("username");
			
			///======By attribute css = [attribute='value']
		//driver.findElement(By.cssSelector("[type='password']")).sendKeys("password");
			
		 //======== By class css = .classname
       // driver.findElement(By.cssSelector(".search-query")).sendKeys("Fund transfer");

        //======== By tag css = tag
      //  driver.findElement(By.cssSelector("button")).click();
        
        
        ////****************
        //======== By tag+id -- css = tag#id
      //  driver.findElement(By.cssSelector("input#user_login")).sendKeys("username");

        //======== By tag+class -- css = tag.classname
    //    driver.findElement(By.cssSelector("i.icon-question-sign")).click();

        //======== By tag+attribute -- css = tag[attribute=value]
     //   driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys("password");
		
        ///////+++++++++++++
        
        //-------------------------       
        //======== By tag+id+attribute --- css = tag#id[attribute=value]
   //     driver.findElement(By.cssSelector("input#user_remember_me[name='user_remember_me']")).click();

    //    driver.findElement(By.name("submit")).click();
    //    driver.findElement(By.id("details-button")).click();
    //    driver.findElement(By.id("proceed-link")).click();
//
  //     
  //      driver.findElement(By.linkText("Pay Bills")).click();

        //======== By tag+class+attribute --- css = tag.classname[attribute=value]
    //    driver.findElement(By.cssSelector("input.span1[required='required']")).sendKeys("90");

        //======== By tag+class+id --- css = tag.classname#id
    //    driver.findElement(By.cssSelector("input.span4#sp_description")).sendKeys("Pay bills for electricity");

        //======== By tag+class+id+attribute --- css = tag.classname#id[attribute=value]
    //    WebElement amountbox = driver.findElement(By.cssSelector("input.span1#sp_amount[type='text']"));
    //    amountbox.clear();
    //    amountbox.sendKeys("50");
        
        
        ///  BY xPATH     
        
        //Absolute xpath 
        driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/form[1]/input[1]")).sendKeys("online banking");
		
        
        // relative xpath  by chropath
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        
        //xpath = tag+Attribute = //tag[@attribute='value']
        driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys("username");
        
        
        driver.findElement(By.xpath("//*[@type='text']")).clear();
        
        
        //cpath with .sign
        driver.findElement(By.xpath(".//input[@name='user_login']")).sendKeys("username");
        
        
        //xpath with contains() with attribute
        driver.findElement(By.xpath("//input[contains(@id, 'password')]")).sendKeys("password");
        
        
        //xpath with contains() with href
        
      //  driver.findElement(By.xpath("//a[contains(@href, '/about/legal/#privacy')][2]")).click();
        
        
        //xpath with contains with text 
        driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
        
        
        driver.findElement(By.xpath("//a[contains(text(),'Zero Bank')]")).click();
        
        //xpath with contains with image
        driver.findElement(By.xpath("//img[contains(@src, 'main_carouse_1.jpg')]")).click();
        
        /// driver close
		driver.close();
		
		//quit browser
		
		driver.quit();
		
	
		
	}

}

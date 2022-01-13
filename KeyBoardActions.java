package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// Mouse Right Click
		Actions act= new Actions(driver);
		
		  //identify elements
        WebElement search = driver.findElement(By.name("q"));
 
        //Press enter button on keyboard
        search.sendKeys("Selenium");//This sendkeys comes from selenium.WebElements
        search.sendKeys(Keys.ENTER);
       

      //Press Tab & enter button on keyboard
        act.sendKeys(Keys.TAB);   //This sendkeys comes from selenium.interactions
        act.sendKeys(Keys.ENTER);
        act.build().perform(); //for binding all the things used in script we used this, without this also this script works normally.
		
      //multiple actions of key storks
        
      //Action interface we have used here & not Actions Class. 
        Action kbEvents = act.keyDown(search, Keys.SHIFT).sendKeys("Java Code Geeks")
                .keyUp(search, Keys.SHIFT).doubleClick().contextClick().build(); // keyDown is for holding the key and keyUp is to release
        kbEvents.perform();
        driver.close();
		driver.quit();
	}

}

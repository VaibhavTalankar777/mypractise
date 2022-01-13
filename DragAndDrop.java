package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		//Added Implicit Wait
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		 WebElement Source= driver.findElement(By.id("draggable"));
		WebElement Target =driver.findElement(By.id("droppable"));
		
		//create object of actions class
		Actions act =new Actions(driver);
		
		//Method 1
		//act.dragAndDrop(Source, Target).build().perform();
		
		//Method 2
		act.clickAndHold(Source).moveToElement(Target).release().build().perform();
		
		
		
		driver.close();
		driver.quit();
	}

}

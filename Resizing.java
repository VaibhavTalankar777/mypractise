package SeleniumWebDriverAdvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/resizable/");
		
		Actions act =new Actions(driver);
		
		driver.switchTo().frame(0);
		
		 //identify elements
        WebElement resizer = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));

        Thread.sleep(1000);

        //resize the box
        act.dragAndDropBy(resizer, 50, 80).build().perform();   //here, api used is dragAndDropBY not dragAndDrop.
                        //(instance,x axis,y axis)
        Thread.sleep(3000);
        act.moveToElement(resizer).dragAndDropBy(resizer, 14, 20).build().perform();
        Thread.sleep(3000);   
		
		
		driver.close();
		driver.quit();
	}

}

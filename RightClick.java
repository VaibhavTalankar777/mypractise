package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		// Mouse Right Click
		Actions act= new Actions(driver);
		
		 //identify element
        WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));


        // right click on button
        act.contextClick(button).build().perform();


        //select the option
        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
        Thread.sleep(1000);

        //switch to alert and get the text
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);

        //close alert
        driver.switchTo().alert().accept();
		
		
		
		driver.close();
		driver.quit();
	}

}

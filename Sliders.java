package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//Added Implicit Wait
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/");
		
		Actions act =new Actions(driver);
		
		driver.switchTo().frame(0);
		
		//WebElement slider= driver.findElement(By.xpath("//body/div[@id='slider']/span[1]"));    
		
		WebElement slider1=driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		act.dragAndDropBy(slider1, 300, 0);     //(object ,x axis , y axis )
		
		
		
		driver.close();
		driver.quit();

	}

}

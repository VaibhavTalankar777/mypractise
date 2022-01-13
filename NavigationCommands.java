package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("onlineBankingMenu")).click();
		
		//Navigate commands 
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		
		driver.navigate().refresh();
		
		
		driver.navigate().to("https://www.selenium.dev/");
		
		driver.get("http://zero.webappsecurity.com/");
		
		driver.close();
		driver.quit();

	}

}

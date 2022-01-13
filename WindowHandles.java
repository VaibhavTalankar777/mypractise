package SeleniumBasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
		
		String pHandle= driver.getWindowHandle();
		System.out.println(pHandle);
	   driver.findElement(By.id("getwebsitebtn")).click();
		
		Set<String> handles =driver.getWindowHandles();
		System.out.println(handles);
		
		
		for(String h:handles)  
		{
			System.out.println("The Value of current handle is ---" +h);
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());
			
		}
		
		
		driver.close();
		driver.quit();
	}

}

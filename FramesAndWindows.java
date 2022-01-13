package SeleniumBasics;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAndWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		
		
		////+++++++++++= Working with Frames=============
		
		WebElement iframe= driver.findElement(By.id("mce_0_ifr"));
	    driver.switchTo().frame(iframe);
	    
	    WebElement textarea= driver.findElement(By.id("tinymce"));
		textarea.clear();
		textarea.sendKeys("This is text to enter into iframe");
		
		driver.switchTo().defaultContent();
		
		
		
		////////  working with pop up window
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		String pHandle= driver.getWindowHandle();
		System.out.println(pHandle);
		driver.findElement(By.linkText("Click Here")).click();
	
		Set<String> handles =driver.getWindowHandles();
		System.out.println(handles);
		
		
		for(String h:handles)  //for loop will executed 2 times as there only 2 windows available,here.
		{
			System.out.println("The Value of current handle is ---" +h);
			driver.switchTo().window(h);
			System.out.println(driver.getTitle());
		
		}
		
		
		
		
		
		
		
		
		driver.close();
		driver.quit();
	}

}

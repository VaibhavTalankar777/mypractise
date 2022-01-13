package SeleniumWebDriverAdvance;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/upload");
		
	  //identify webelement 
		WebElement uploadButton =driver.findElement(By.id("file-upload"));
		
		//add a file
		uploadButton.sendKeys("C:\\Users\\Administrator\\Desktop\\emptytextfilefor testing.txt");
		
		// click on upload button
        driver.findElement(By.id("file-submit")).click();
        assertEquals(driver.findElement(By.id("uploaded-files")).getText(), "emptytextfilefor testing.txt");
		
		
		
		
		
		driver.close();
		driver.quit();
	}

}

package SeleniumWebDriverAdvance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Create object of Actions Class
		Actions act =new Actions(driver);
		
		//identify elements 
		WebElement admin =driver.findElement(By.id("menu_admin_viewAdminModule"));
		WebElement usermgt =driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement users  = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		
		
		act.moveToElement(admin).build().perform();
		Thread.sleep(2000);
		
		act.moveToElement(usermgt).build().perform();
		Thread.sleep(2000);
		act.moveToElement(users).click().build().perform();
		Thread.sleep(2000);
		
		///oR 
		
	//	act.moveToElement(admin).moveToElement(usermgt).moveToElement(users).click().build().perform();
		
		
		
		
		
		

	      
		driver.close();
		driver.quit();

	}

}

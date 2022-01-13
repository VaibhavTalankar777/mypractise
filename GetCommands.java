package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
		
		
		String Title= driver.getTitle();
		System.out.println(Title);
		
		System.out.println("===========");
		
		String Pagesourse= driver.getPageSource();
		System.out.println(Pagesourse);
		System.out.println("=============");
		
		driver.findElement(By.id("onlineBankingMenu")).click();
		//Get Current URL
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		//get text
		String header= driver.findElement(By.id("money_map_link")).getText();
		System.out.println(header);
		
		
		driver.navigate().to("http://zero.webappsecurity.com/login.html");
		
		driver.findElement(By.name("submit")).click();
		
		String errormsg= driver.findElement(By.xpath("//form[@id='login_form']/div[1]")).getText();
		System.out.println(errormsg);
		
		//Get Attribute 
		WebElement passbox =driver.findElement(By.name("user_password"));
		
		String typebox= passbox.getAttribute("type");
		System.out.println(typebox);
		
		System.out.println(passbox.getAttribute("class"));
		
		//get class
		System.out.println(passbox.getClass());
		
		
		
		driver.close();
		driver.quit();

	}

}

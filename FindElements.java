package SeleniumBasics;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumBrowserDrivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("http://zero.webappsecurity.com/");
		assertEquals(driver.getTitle(),"Zero - Personal Banking - Loans - Credit Cards");
		
				 
		// collect all the links from page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links);

        // translate all the links into link text to use the links
        String[] linkText = new String[links.size()];
        int i = 0;

        for(WebElement l : links) {
            linkText[i] = l.getText();
            System.out.println(linkText[i]);
            i++;
        }


        // iterate and click on all the links
        for (String lt : linkText) {
            if (lt.contentEquals("More Services")) {
                driver.findElement(By.linkText(lt)).click();
                System.out.println(driver.getTitle());
                driver.navigate().back();
                Thread.sleep(2000);
                assertEquals(driver.getTitle(), "Zero - Personal Banking - Loans - Credit Cards");
            }else if (lt == "<" || lt == ">") {
                continue;
            }else {
                driver.findElement(By.linkText(lt)).click();
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
            }

        }		 
	    	
		driver.close();
		driver.quit();

	}

}

package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class DataDrivenTest {
  @Test(dataProvider = "dp")
  public void DataDriven(Integer n, String s) {
	  System.out.println("The test data is - Int= "  + n + "& String = " +s);
	  
  }

  @DataProvider
  public Object[][] dp() {
	  System.out.println("I am DataProvider");
	  
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is @AfterTest");
  }
  
  @BeforeMethod
  public void BeforeMethod(){
	  System.out.println("This is @BeforeMethod");
  }
  @AfterMethod
  public void AfterMethod(){
	  System.out.println("This is @AfterMethod");
  }

}

package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGGeneratedClass {
	
  @Test (priority=1,groups={"smoke"})
  public void Login() 
  {
	  System.out.println("This IS Login Test");
	  System.out.println("This is p3 Test");
  }
  @Test (priority=2,groups={"smoke","Regression"})
  public void TestNGTest() 
  {
	  System.out.println("This is TestNGTest");
	  System.out.println("This is p2 Test");
  }
  @Test (priority=3, groups={"Regression"})
  public void PayBills() 
  {
	  System.out.println("This is PayBills Test");
	  System.out.println("This is p1 Test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" this is @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is @ AfterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is @BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is @AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is @BeforeSuite");
  }
  
  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is  @AfterSuite");
  }
  }



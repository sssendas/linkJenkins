package testNGClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.UIUtils;

public class TestPrimary
{
	 WebDriver driver = null;
	 WebDriverWait wait = null;
	 
//	just putting a comment
	
	@BeforeClass
	public void driverInitiator()
	{
		driver = new UIUtils().driverInitiator();
		wait = new WebDriverWait(driver,100);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}
	
	@Test(priority='1')
	public void googleTest()
	{
		String expectedTitle = "Google";
		driver.get("https://www.google.com");
		String actulTitle = driver.getTitle();
		System.out.println("'TestPrimary.class': Expected title of webpage is: "+expectedTitle);
		System.out.println("'TestPrimary.class': Actual title of webpage is: "+actulTitle);
		
		Assert.assertEquals(actulTitle, expectedTitle);
		
	}
	
	@Test(priority='3')
	public void facebookTest()
	{
		String expectedTitle = "Facebook – log in or sign up";
		driver.get("https://www.facebook.com");
		String actulTitle = driver.getTitle();
		
		System.out.println("'TestPrimary.class': Expected title of webpage is: "+expectedTitle);
		System.out.println("'TestPrimary.class': Actual title of webpage is: "+actulTitle);
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@Test(priority='2')
	public void amazoninTest()
	{
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		driver.get("https://www.amazon.in");
		String actulTitle = driver.getTitle();
		
		System.out.println("'TestPrimary.class': Expected title of webpage is: "+expectedTitle);
		System.out.println("'TestPrimary.class': Actual title of webpage is: "+actulTitle);
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	
	 @AfterClass
	 public void driverQuit()
	 { driver.quit(); }
	 

}

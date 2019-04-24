package testNGClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CustomListenersSS;
import utilities.ScreenShotTaker;
import utilities.UIUtils;

@Listeners(CustomListenersSS.class)
public class TakeFailScreenShots extends ScreenShotTaker
{
	
	WebDriverWait wait = null;
//	just putting a comment
	
	@BeforeClass
	public void driverInitiators()
	{
		driverInitiator();
		wait = new WebDriverWait(driver,100);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}
	
	@Test
	public void googleTest()
	{
		String expectedTitle = "google";
		driver.get("https://www.google.com");
		String actulTitle = driver.getTitle();
		System.out.println("'TakeFailScreenShots.class': Expected title of webpage is: "+expectedTitle);
		System.out.println("'TakeFailScreenShots.class': Actual title of webpage is: "+actulTitle);
		
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@Test
	public void facebookTest()
	{
		String expectedTitle = "facebook – log in or sign up";
		driver.get("https://www.facebook.com");
		String actulTitle = driver.getTitle();
		
		System.out.println("'TakeFailScreenShots.class': Expected title of webpage is: "+expectedTitle);
		System.out.println("'TakeFailScreenShots.class': Actual title of webpage is: "+actulTitle);
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@Test
	public void amazoninTest()
	{
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		driver.get("https://www.amazon.in");
		String actulTitle = driver.getTitle();
		
		System.out.println("'TakeFailScreenShots.class': Expected title of webpage is: "+expectedTitle);
		System.out.println("'TakeFailScreenShots.class': Actual title of webpage is: "+actulTitle);
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	 @AfterClass
	 public void driverQuit()
	 { driver.quit(); }

}

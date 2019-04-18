package testNGClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.UIUtils;

public class TestTertiary
{
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	@BeforeTest
	public void driverInitiator()
	{
		driver = new UIUtils().driverInitiator();
		wait = new WebDriverWait(driver,100);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	}
	
	@Test
	public void googleTest()
	{
		String expectedTitle = "Google";
		driver.get("https://www.google.com");
		String actulTitle = driver.getTitle();
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@Test
	public void facebookTest()
	{
		String expectedTitle = "Facebook – log in or sign up";
		driver.get("https://www.facebook.com");
		String actulTitle = driver.getTitle();
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@Test
	public void amazoninTest()
	{
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		driver.get("https://www.amazon.in");
		String actulTitle = driver.getTitle();
		Assert.assertEquals(actulTitle, expectedTitle);
	}
	
	@AfterTest
	public void driverQuit()
	{
		driver.quit();
	}

}

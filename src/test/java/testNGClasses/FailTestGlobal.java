package testNGClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.UIUtils;

public class FailTestGlobal 
{
	WebDriver driver = null;
	 WebDriverWait wait = null;
	 
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
			String expectedTitle = "google";
			driver.get("https://www.google.com");
			String actulTitle = driver.getTitle();
			System.out.println("'FailTestGlobal.class': Expected title of webpage is: "+expectedTitle);
			System.out.println("'FailTestGlobal.class': Actual title of webpage is: "+actulTitle);
			
			Assert.assertEquals(actulTitle, expectedTitle);
			
		}
	 
	 @AfterClass
	 public void driverQuit()
	 { driver.quit(); }
	 

}
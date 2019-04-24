package utilities;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UIUtils
{
	public static WebDriver driver = null;
	public WebDriver driverInitiator()
	{
		
		
		Properties prop = new PropertyReader().propertyReader();
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")||browser.equalsIgnoreCase("firefox")||browser.equalsIgnoreCase("ie"))
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","src/main/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver","src/main/resources/drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}
		else
		{
			System.out.println("Wrong browser value has been kept in config.properties file");
		}
		
		return driver;
	}

}

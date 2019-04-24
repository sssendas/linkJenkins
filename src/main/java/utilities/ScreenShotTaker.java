package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotTaker extends UIUtils
{
	public void takeScreenShot(String methodName)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(src, new File("ScreenShots/"+methodName+".jpg"));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}

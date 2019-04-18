package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public final class PropertyReader
{
	public Properties propertyReader()
	{
		Properties prop = new Properties();
		FileInputStream fis = null;
		
		File file = new File("src/main/resources/configs/config.properties");
		
		try
		{
			fis = new FileInputStream(file);
		}
		catch(Exception e)
		{
			System.out.println("Couldn't find the expected file in: "+file);
			System.out.println(e);
		}
		
		try
		{
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception took place during loding of property file");
			System.out.println(e);
		}
		
		return prop;
	}

}

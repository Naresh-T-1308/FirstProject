package basetest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Browser {
	public static WebDriver driver;
	public static Properties pro = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;

	@BeforeTest
	public void baseTest() throws IOException
	{
		if ( driver == null)
		{
			fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
			fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			pro.load(fr);
			loc.load(fr1);
		}

		if(pro.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pro.getProperty("url"));
		}

		else if(pro.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(pro.getProperty("url"));
		}
	}

/*	@AfterTest
	public void terminate()
	{
		driver.close();
	}
	*/

}



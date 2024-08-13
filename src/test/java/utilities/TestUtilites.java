package utilities;

import java.io.FileReader;
import java.util.Properties;

public class TestUtilites {
	
	public static void main(String[] args) throws Exception {
		
		
	//	System.out.println(System.getProperty("user.dir"));
		 
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties();
		p.load(fr);
	
		/*
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
		
		
		FileReader f = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
		
		Properties p1 = new Properties();
		p1.load(f);
		System.out.println(p1.getProperty("email"));
		System.out.println(p1.getProperty("password"));
		
		*/
	}

}

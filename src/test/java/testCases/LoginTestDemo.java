package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basetest.Browser;

public class LoginTestDemo extends Browser{
	
	@Test
	public void loginTest() throws Exception {
		
		driver.findElement(By.xpath(loc.getProperty("email"))).sendKeys("naresht1304@gmail.com");
				driver.findElement(By.xpath(loc.getProperty("password"))).sendKeys("817@Naresh@");
				driver.findElement(By.xpath(loc.getProperty("login"))).click();
				
			//	Thread.sleep(5000);
	}

}

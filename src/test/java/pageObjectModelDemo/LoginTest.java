package pageObjectModelDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@Test
	public void login() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-tap-app.netlify.app/");
		
		LoginPage lg = new LoginPage(driver);
		
		lg.emailfield().sendKeys("naresht1304@gmail.com");
		lg.passwordfield().sendKeys("817@Naresh@");
		lg.loginfield().click();
		
		Homepage hp = new Homepage(driver);
		
		
		Boolean b = hp.homepage().isDisplayed();
		//assert.assertTrue(hp.homepage().isDisplayed());
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}

	
}

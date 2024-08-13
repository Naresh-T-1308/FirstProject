package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By emailfield = By.id("login_email");
	private By passwordfield = By.id("login_password");
	private By loginfield = By.xpath("//*[@id=\"login\"]/div[3]/div/div/div/div/button");
	
	public WebElement emailfield() {
		return driver.findElement(emailfield);
	}
	public WebElement passwordfield() {
		return driver.findElement(passwordfield);
	}
	public WebElement loginfield() {
		return driver.findElement(loginfield);
	}

}

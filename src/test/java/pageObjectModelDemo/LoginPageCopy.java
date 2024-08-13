package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageCopy {
	
	WebDriver driver;
	
	public  LoginPageCopy(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="login_email" )
	private WebElement emailfield ;
	
	@FindBy(id ="login_password" )
	private WebElement passwordfield ;
	
	@FindBy(xpath ="//*[@id=\"login\"]/div[3]/div/div/div/div/button" )
	private WebElement loginfield ;
	
	
	
	public WebElement emailfield() {
		return emailfield;
	}
	public WebElement passwordfield() {
		return passwordfield;
	}
	public WebElement loginfield() {
		return loginfield;
	}

}

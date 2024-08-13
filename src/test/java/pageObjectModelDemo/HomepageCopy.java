package pageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageCopy {
	
	WebDriver driver;
	
	public HomepageCopy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id=\"root\"]/div/div/main/div/div[1]/h1" )
	private WebElement homepage ;
	
	public WebElement homepage() {
		return homepage;
	}


}

package pageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By homepage = By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/h1");
	
	public WebElement homepage() {
		return driver.findElement(homepage);
	}


}

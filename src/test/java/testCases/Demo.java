package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-tap-app.netlify.app/");
		driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("naresht1304@gmail.com");
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("817@Naresh@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement s= driver.findElement(By.xpath("//h1[normalize-space()='Good Morning, Jessica!']"));
	}

}

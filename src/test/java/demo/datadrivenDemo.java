package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadriverDemo {
	@Test(dataProvider = "create")
	public void dataset2(String cat, String product) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		WebElement dropdown = 	driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(cat);

		WebElement find = driver.findElement(By.id("gh-ac"));
		find.sendKeys(product);
		driver.findElement(By.id("gh-btn")).click();
		driver.close();

	}

	@DataProvider(name = "create")
	public Object[][] data2()
	{
		return new Object[][]
				{
			{"Books","selenium"},
			{"Cameras & Photo","iphone"},
			{"Cell Phones & Accessories","samsung"},
			{"Clothing, Shoes & Accessories","tshirts"},
				};
	}


}

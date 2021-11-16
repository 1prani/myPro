package com.amazon.mobileprice;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.vtiger.genricUtil.WebDriverUtility;

public class GetthePriceOfmobile {

	@Test
	public void getthePriceOfmobile() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobiles under 10000+");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
//		driver.findElement(By.xpath(
//				"//a[@href=\"/s?k=mobiles+under+10000%2B&rh=n%3A1389432031%2Cp_89%3ARedmi&dc&crid=3395C7C6IE065&qid=1636522711&rnid=3837712031&sprefix=moblies+%2Caps%2C302&ref=sr_nr_p_89_1\"]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@id=\"p_89/Redmi\"]")).click();

		WebElement allprices = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"]"));

		System.out.println(allprices.getText());

	}
}

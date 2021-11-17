package com.amazon.mobileprice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/**
 * in this we get the disappering elemets useing source in console
 * and pause the page or we can also use f8 button 
 * @author home
 *
 */
public class LenskartDropdown {

	@Test
	public void lnsekartDropdown() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name=\"q\"]")).click();

		List<WebElement> all = driver.findElements(By.xpath("//ul[@class=\"trending_list menu-link\"]/li"));

		for (int i = 0; i < all.size(); i++) {

			System.out.println(all.get(i).getText());
			
			

		}

	}

}

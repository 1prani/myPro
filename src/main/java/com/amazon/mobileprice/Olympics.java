package com.amazon.mobileprice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Olympics {

	@Test
	public void olympics() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.xpath("//span[text()='Eliud KIPCHOGE']")).getText();
		
		WebElement medals = driver.findElement(By.xpath("//span[text()='Eliud KIPCHOGE']/ancestor::ul/li[1]/div[@class='featured-athlete__medals text-body-sm']"));

		String names = medals.getText();
		
		System.out.println(names);
		
		
		
		
		
	}
}

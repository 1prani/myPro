package com.amazon.mobileprice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	@Test
	public void calender() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);
		driver.findElement(By.className("langCardClose")).click();

		driver.findElement(By.xpath("//div[@class='landingContainer']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\"fsw_inputBox dates inactiveWidget \"]")).click();

		for (int i = 0; i < 11; i++) {

			try {
				driver.findElement(By.xpath("//div[@aria-label=\"Thu Feb 24 2022\"]")).click();

				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();

			}

		}
	}

}

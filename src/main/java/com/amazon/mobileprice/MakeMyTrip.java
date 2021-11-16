package com.amazon.mobileprice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeMyTrip {

	@Test(dataProvider = "getvalue")
	public void makeMyTrip(String src, String dest) throws Throwable {

		Date d = new Date();

		System.out.println(d);

//		Wed Nov 10 15:29:32 IST 2021

		String sd = d.toString();
		String[] all = sd.split(" ");
		String day = all[0];
		String month = all[1];
		String date = all[2];
		String yr = all[5];

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.className("langCardClose")).click();

		driver.findElement(By.xpath("//div[@class='landingContainer']")).click();

		driver.findElement(By.id("fromCity")).click();

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(src);
		driver.findElement(By.xpath("//div[contains(text(),'" + src + "')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dest);
		driver.findElement(By.xpath("//div[contains(text(),'" + dest + "')]")).click();

		driver.findElement(By.xpath("//div[@aria-label='" + day + " " + month + " " + date + " " + yr + "']")).click();

	}

	@DataProvider
	public Object[][] getvalue() {
		Object arr[][] = new Object[4][2];

		arr[0][0] = "HYD";
		arr[0][1] = "BOM";

		arr[1][0] = "HYD";
		arr[1][1] = "MAA";

		arr[2][0] = "HYD";
		arr[2][1] = "BLR";

		arr[3][0] = "HYD";
		arr[3][1] = "PNQ";

		return arr;

	}

}

package com.amazon.mobileprice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SirICCprogram {

	@Test
	public void sirICCprogram() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> points = driver.findElements(By.xpath("//table[@class ='table']//tr[*]//td[3]"));

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < points.size(); i++) {
			String onepnt = points.get(i).getText();

			int num = Integer.parseInt(onepnt);

			a1.add(num);

		}
		Collections.sort(a1);
		System.out.println(a1.size());
	}

}

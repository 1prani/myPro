package com.amazon.mobileprice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VtigerTable {

	@Test
	public void vtigerTable() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");

		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Reporter.log("loged in Successfully", true);

		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		wUtil.waitForPageLoad(driver);

		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		List<WebElement> allorgs = driver
				.findElements(By.xpath("//table[@class='lvt small']//tr[*]//td[3]//a[@title='Organizations']"));

//		for (int i = 1; i < allorgs.size(); i++) 
//		{
//			System.out.println(allorgs.get(i).getText());
//			
//		}

		// a[@title='Organizations']
//		"ExcelEntry834";
		String wanted = driver.findElement(By.xpath("//a[text()='autoentry--30']")).getText();
//		String wanted2 = driver.findElement(By.xpath("//a[text()='ExcelEntry834']")).getText();

//		String arr[] = new String[2];
//
//		arr[0] = "autoentry--30";
//		arr[1] = "ExcelEntry834";
//	
//		for(int i =0; i<=2; i++) {
//			

		for (WebElement oneorg : allorgs) {
			String org = oneorg.getText();
			System.out.println(org);
//			Thread.sleep(2000);

			if (org.equalsIgnoreCase(wanted)) {

				Thread.sleep(1000);
//				driver.findElement(By.xpath("//table[@class='lvt small']//tr[*]//td[1]/input[@name='selected_id']"))
//						.clsick();

				driver.findElement(By.xpath(
						"//a[text()='" + wanted + "']/ancestor::tr[@class='lvtColData']//input[@type='checkbox']"))
						.click();
//				driver.findElement(By.xpath("//tr[@class='lvtColData']//input[@type='checkbox']")).click();

//				driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
				break;
			}

//		}

		} // 1st for loop

	}
}

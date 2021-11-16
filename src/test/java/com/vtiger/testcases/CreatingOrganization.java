package com.vtiger.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.JSONFileUtilty;
import com.vtiger.genricUtil.JavaUtility;

public class CreatingOrganization {
	
    @Test
	public static void creatingOrganization() throws Throwable {
		// set property

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		JSONFileUtilty json = new JSONFileUtilty();
		String url = json.jsonfileutility("url");
		String un = json.jsonfileutility("us");
		String pwd = json.jsonfileutility("pa");

		// url
		driver.get(url);
		// entering username and password
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		// window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// click on organization
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		// click on (+) symbol
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		/// entering in the text box
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("autoentry6"+"--"+JavaUtility.genrandomnumber());
		// selecting the drop down box
		WebElement sdd = driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		Select s = new Select(sdd);
		// selecting by index in drop down
		s.selectByIndex(3);
		// click on save button
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Thread.sleep(3000);
		// mouse hovering to singout image
		Actions a = new Actions(driver);
		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		a.moveToElement(logout).perform();
		Thread.sleep(4000);
		// click on sign out
		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
	}

}

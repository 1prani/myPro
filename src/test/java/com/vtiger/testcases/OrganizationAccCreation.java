package com.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.ExcelUtility;
import com.vtiger.genricUtil.JavaUtility;
import com.vtiger.genricUtil.PropertyFIleUtility;
import com.vtiger.genricUtil.WebDriverUtility;

public class OrganizationAccCreation {

	@Test
	public void loginTest() throws Throwable {
		// set property

//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverUtility wUtil = new WebDriverUtility();

		PropertyFIleUtility putil = new PropertyFIleUtility();
		
		ExcelUtility eUtil = new ExcelUtility();
		
		String acctname = eUtil.excelUtility("sheet1", 1, 2)+JavaUtility.genrandomnumber();

		String url = putil.propertyFileUtility("url");
		String un = putil.propertyFileUtility("user");
		String pwd = putil.propertyFileUtility("pass");
		// url
		driver.get(url);
		// entering user name and password
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();
		System.out.println("loged in");
		// waiting
		wUtil.waitForPageLoad(driver);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// click on organization
//		System.out.println("clicked on organization");
		Reporter.log("clicked on orgnization", true);
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		// click on (+) symbol
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		/// entering in the text box
		driver.findElement(By.xpath("//input[@name=\"accountname\"]"))
			.sendKeys(acctname);
		System.out.println(acctname);

		WebElement cb = driver.findElement(By.xpath("//input[@name=\"emailoptout\"]"));
		if (cb.isSelected()) {
			System.out.println("is selected wow");
		}
		else {
			System.out.println("hey it is not selected ");
		}
		
		// click on save button
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Thread.sleep(3000);
		// mouse hovering to singout image

//		Actions a = new Actions(driver);
		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		wUtil.mouseOver(driver, logout);

//		a.moveToElement(logout).perform();
		Thread.sleep(2000);
		// click on signout
		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
		Reporter.log("loged out and closed", true);
		driver.close();
		
//		if(logout.is
		
		
	}

}

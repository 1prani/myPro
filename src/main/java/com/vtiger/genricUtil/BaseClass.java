package com.vtiger.genricUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	// all public utilities

	public WebDriver driver;
	public PropertyFIleUtility pUtil = new PropertyFIleUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public static WebDriver sdriver;

	// ---------------------test--------------------------//

	@BeforeMethod(groups = { "smokeTest", "regresionTest" })
	public void loginM() throws Throwable {

		String url = pUtil.propertyFileUtility("url");
		String un = pUtil.propertyFileUtility("user");
		String pwd = pUtil.propertyFileUtility("pass");
//					

		driver.get(url);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Reporter.log("loged in Successfully", true);

		Thread.sleep(3000);
		wUtil.waitForPageLoad(driver);
	}

	@AfterMethod(groups = { "smokeTest", "regresionTest" })
	public void logout() throws Throwable {
		System.out.println("----------log-Out----------");

		// hovering to singout

		Thread.sleep(4000);
		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		wUtil.mouseOver(driver, logout);
		Thread.sleep(2000);
	}

	
//	@Parameters("browser")
	@BeforeClass(groups = { "smokeTest", "regresionTest" })
	public void opentheBrowser() throws Throwable {

		String BROWSER = pUtil.propertyFileUtility("BROWSER");

		System.out.println("--------open the browser--------");

		if (BROWSER.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		sdriver = driver;
		// open the browser

	}

	@AfterClass(groups = { "smokeTest", "regresionTest" })
	public void closetheBrowser() {
		System.out.println("----------close the browser------------");
		// click on signout
		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
		Reporter.log("loged out and closed", true);
		driver.close();

	}

	@BeforeSuite(groups = { "smokeTest", "regresionTest" })
	public void connectDatabase() {
		System.out.println("connect to database");
	}

	@AfterSuite(groups = { "smokeTest", "regresionTest" })
	public void closeDataBase() {
		System.out.println("close the database");
	}

}

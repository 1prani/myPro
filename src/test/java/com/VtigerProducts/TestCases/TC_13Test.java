package com.VtigerProducts.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;

public class TC_13Test extends BaseClass{

	@Test(groups="smokeTest")
	public void addingNewProductwithDiffterntUnitPrice() throws Throwable {
		System.out.println("this is from addingNewProductwithDiffterntUnitPrice smokeTest");

		// open the browser
//		WebDriver driver = new ChromeDriver();
//
//		PropertyFIleUtility pUtil = new PropertyFIleUtility();
//		WebDriverUtility wUtil = new WebDriverUtility();
//
//		String url = pUtil.propertyFileUtility("url");
//		String un = pUtil.propertyFileUtility("user");
//		String pwd = pUtil.propertyFileUtility("pass");
////		String product = pUtil.propertyFileUtility("proname");
////		String qty = pUtil.propertyFileUtility("qty");
//		int num = JavaUtility.genrandomnumber();
//		int uprice = 50;

//		driver.get(url);
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//		Reporter.log("loged in Successfully", true);
//
//		Thread.sleep(3000);
//		wUtil.waitForPageLoad(driver);

		// click on products module
		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		productpage.click();
		Thread.sleep(3000);

		// creating the products (+)
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
		Thread.sleep(3000);

		// sendKeys("MicroMax");
		driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("autoUnitPrice5555");
		Reporter.log("New Product entered", true);
		Thread.sleep(3000);

		// entering unit price---num autogenrated num

		driver.findElement(By.xpath("//input[@id=\"unit_price\"]")).sendKeys("15555555");
		Reporter.log("Unit Price is  entered", true);

		// saveing it
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Reporter.log("Saved the product", true);
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		// agin clicked on products coz of sere
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]")).click();

		// searching for it in dropdown
		WebElement ddw = driver.findElement(
				By.xpath("//div[@id=\"basicsearchcolumns_real\"] /descendant::select[@name=\"search_field\"]"));
//				ddw.click();

		Select s = new Select(ddw);
		s.selectByIndex(6);

		// sendkeys the given price
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("50");

		// clicking on search button
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Reporter.log("Searched for the product", true);
		Thread.sleep(4000);

		
		//logout and close

	}

}

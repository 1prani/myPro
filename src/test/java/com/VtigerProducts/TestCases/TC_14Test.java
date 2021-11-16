package com.VtigerProducts.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;

public class TC_14Test extends BaseClass{

	@Test(groups="smokeTest")
	public void searchbyClickingOnCharacter() throws Throwable {
		System.out.println("this is from searchbyClickingOnCharacter  smokeTest ");

//		// open the browser
//		WebDriver driver = new ChromeDriver();
//
//		PropertyFIleUtility pUtil = new PropertyFIleUtility();
//		WebDriverUtility wUtil = new WebDriverUtility();
//
//		String url = pUtil.propertyFileUtility("url");
//		String un = pUtil.propertyFileUtility("user");
//		String pwd = pUtil.propertyFileUtility("pass");
//				String product = pUtil.propertyFileUtility("proname");
//				String qty = pUtil.propertyFileUtility("qty");
//		int num = JavaUtility.genrandomnumber();
//				int uprice = 50;

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

		// sendKeys("Nokia" + num");
		driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("Nokia54hjhgjhg");
		Reporter.log("New Product nokia entered", true);
		Thread.sleep(3000);

		

		// saveing it
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Reporter.log("Saved the product", true);
		Thread.sleep(3000);
//		driver.navigate().back();
//		driver.navigate().back();
		// agin clicked on products coz of sere
		driver.findElement(By.xpath("//a[@href=\"index.php?action=ListView&module=Products&parenttab=Inventory\"]")).click();

		

//		// sendkeys the given price
//		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("Nokia");

		// clicking on n for nokia and k for key board
		driver.findElement(By.xpath("//td[@id=\"alpha_14\"]")).click();
		Reporter.log("Searched for the product with alphabet button-'N'", true);
		Thread.sleep(4000);

//		// hovering to singout
//
//		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		wUtil.mouseOver(driver, logout);
//		Thread.sleep(2000);
//
//		// click on signout
//		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
//		Reporter.log("loged out and closed", true);
//		driver.close();

	}

}

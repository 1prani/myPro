package com.VtigerProducts.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;
//import com.vtiger.genricUtil.JavaUtility;

public class AllTestCasesclassTest extends BaseClass {

	// here all the test cases are written in one place
	@Test
	public void searchingbyEnteringSearchBOX() throws Throwable {

		String qty = pUtil.propertyFileUtility("qty");
		// clicking on products page
		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		productpage.click();
		Thread.sleep(3000);

		// searching by drop down
		// selecting the qty/unit from the serchby dropdown
		WebElement ddw = driver.findElement(
				By.xpath("//div[@id=\"basicsearchcolumns_real\"] /descendant::select[@name=\"search_field\"]"));
//						ddw.click();

		Select s = new Select(ddw);
		s.selectByIndex(5);

		// entering the serchbox
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys(qty);

		// clicking on search button
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

	}

	@Test
	public void searchbyClickingOnCHARCTER() throws Throwable {

//		int num = JavaUtility.genrandomnumber();

		// click on products module
		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		productpage.click();
		Thread.sleep(3000);

		// creating the products (+)
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
		Thread.sleep(3000);

		// click on products module
//		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		driver.findElement(By.xpath("//a[@href=\"index.php?action=ListView&module=Products&parenttab=Inventory\"]"))
				.click();

//		productpage.click();
		Thread.sleep(3000);

		// clicking on n for nokia and k for key board
		driver.findElement(By.xpath("//td[@id=\"alpha_14\"]")).click();
		Reporter.log("Searched for the product with alphabet button-'N'", true);
		Thread.sleep(1000);
		

	}

}

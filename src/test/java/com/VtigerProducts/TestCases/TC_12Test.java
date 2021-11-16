package com.VtigerProducts.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;

public class TC_12Test extends BaseClass {

	@Test
	public void searchingforgivenProduct() throws Throwable {

		String qty = pUtil.propertyFileUtility("qty");

		// clicking on products page
		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		productpage.click();
		Thread.sleep(3000);

		// selecting the qty/unit from the serchby dropdown
		WebElement ddw = driver.findElement(
				By.xpath("//div[@id=\"basicsearchcolumns_real\"] /descendant::select[@name=\"search_field\"]"));
//				ddw.click();

		Select s = new Select(ddw);
		s.selectByIndex(5);

		// entering the serchbox
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys(qty);

		// clicking on search button
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();

	}

}

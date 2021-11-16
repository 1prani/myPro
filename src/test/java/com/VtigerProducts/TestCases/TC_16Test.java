package com.VtigerProducts.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.vtiger.genricUtil.BaseClass;


public class TC_16Test extends BaseClass {
	
	

	@Test()
	public void selectMultipleProductsMassEdit() throws Throwable {
		

		// click on products module
		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		productpage.click();
		Thread.sleep(4000);
		String ptitle = pUtil.propertyFileUtility("protitle");
		String title = driver.getTitle();
		wUtil.verify(title, ptitle, "products");

		// selecting checkboxes
		driver.findElement(By.id("31")).click();
		Thread.sleep(2000);
		// driver.findElement(By.id("32")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.id("33")).click();
		// Thread.sleep(2000);

		// click on mass edit button
		driver.findElement(By.xpath("//input[@value=\"Mass Edit\"]")).click();

		// changing the productname
		driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("massedited");
		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();

	}

}

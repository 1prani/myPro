package com.VtigerProducts.TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;

public class TC_15Test extends BaseClass{

	@Test
	public void deletingTheProduct() throws Throwable {

		// open the browser
//		WebDriver driver = new ChromeDriver();
//
//		PropertyFIleUtility pUtil = new PropertyFIleUtility();
//		WebDriverUtility wUtil = new WebDriverUtility();
//
//		String url = pUtil.propertyFileUtility("url");
//		String un = pUtil.propertyFileUtility("user");
//		String pwd = pUtil.propertyFileUtility("pass");
////				String product = pUtil.propertyFileUtility("proname");
////				String qty = pUtil.propertyFileUtility("qty");
////		int num = JavaUtility.genrandomnumber();
////				int uprice = 50;

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

		// sendKeys("keyboard");
		driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("keyboard");
		Reporter.log("New Product entered", true);
		Thread.sleep(3000);

		// saveing it
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Reporter.log("Saved the product", true);
		Thread.sleep(3000);

		// agin clicked on products
		driver.findElement(By.xpath("//a[@href=\"index.php?action=ListView&module=Products&parenttab=Inventory\"]"))
				.click();

		// searching for product name in dropdown
		WebElement ddw = driver.findElement(
				By.xpath("//div[@id=\"basicsearchcolumns_real\"] /descendant::select[@name=\"search_field\"]"));
//						ddw.click();

		Select s = new Select(ddw);
//		s.selectByIndex(2);
		s.selectByValue("productname");

		// sendkeys the given product name -keyboard

		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("keyboard");

		// clicking on search button
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Reporter.log("Searched for the product", true);
		Thread.sleep(4000);

		// selecting the result
//		driver.findElement(By.xpath("//a[@title =\"Products\"and text()=\"keyboard\"]")).click();
		driver.findElement(By.id("64")).click();
		driver.findElement(By.id("65")).click();
		driver.findElement(By.id("66")).click();
		
		
//		// click on delet button
		driver.findElement(By.xpath("//input[@class=\"crmbutton small delete\"]")).click();
		Reporter.log("deleted the product", true);
//
////		/**
////		 * javascript:confirmdelete("index.php%3Fmodule%3DProducts%26action%3DDelete%26record%3D61%26return_modu
////		 * le%3DProducts%26return_action%3Dindex%26parenttab%3DInventory%26return_viewname%3D24%26query%3Dtrue%26
////		 * search_field%3Dproductname%26search_text%3Dkeyboard%26searchtype%3DBasicSearch")
////		 */
////
////		driver.findElement(By.xpath("//a[@href='javascript:confirmdelete(\"index.php%3Fmodule%3DProducts"
////				+ "%26action%3DDelete%26record%3D59%26return_module%3DProducts%26return_action%3Dindex%26"
////				+ "parenttab%3DInventory%26return_viewname%3D24%26query%3Dtrue%26search_field%3Dproductname%26"
////				+ "search_text%3Dkeyboard%26searchtype%3DBasicSearch\")']")).click();
		Thread.sleep(3000);
//
		Alert a = driver.switchTo().alert();
//
		a.accept();
		Reporter.log("pop up is accepted", true);
//
		// hovering to singout


	}

}

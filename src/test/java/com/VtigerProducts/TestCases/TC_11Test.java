package com.VtigerProducts.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;

public class TC_11Test extends BaseClass {

	@Test(groups="regresionTest")
	public void verifyloginpageTest_TC_11() throws Throwable {
		System.out.println("this is from verifyloginpageTest_TC_11 groupsregresionTest");

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
		
//		int num = JavaUtility.genrandomnumber();
//
//		driver.get(url);
//		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(un);
//		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(pwd);
//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
//
//		Thread.sleep(3000);
//		// gettting the home page title
//
//		String actualtitle = driver.getTitle();
//
//		System.out.println(actualtitle);
//
//		String expectedtitle = pUtil.propertyFileUtility("hometitle");
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(actualtitle, expectedtitle);
//		sa.assertAll();
//		Reporter.log("home page title- is valid", true);
////		
//		wUtil.waitForPageLoad(driver);

		// clicking on products page
		WebElement productpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Products&action=index\"]"));
		productpage.click();
		Thread.sleep(3000);
//		// verifying the products page
//
//		String prodtitle = driver.getTitle();
//		System.out.println(prodtitle);
//		String pptitle = pUtil.propertyFileUtility("protitle");
//		sa.assertEquals(prodtitle, pptitle);
//		Reporter.log("products page title- is valid", true);
//		
		// creating the products (+)
		driver.findElement(By.xpath("//img[@title=\"Create Product...\"]")).click();
//		String newprod = driver.getTitle();
//		System.out.println(newprod);
		Thread.sleep(3000);

//		sendKeys("MicroMax1");
		driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("micromax2");
		Thread.sleep(3000);

		// quatliy and unit sendkeys
		driver.findElement(By.xpath("//input[@name=\"qty_per_unit\"]")).sendKeys("6479878978");
		Thread.sleep(3000);
		// saving
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();

//		wUtil.waitForElementtobeVisible(driver, productpage);

		// clicking on other modueles
//		WebElement orgpage = driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]"));
//		orgpage.click();
//		//click on (+) organization 
//		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
//		wUtil.waitForElementtobeVisible(driver, orgpage);
//		Thread.sleep(5000);

//		driver.navigate().refresh();
		// clicking on products and serching for required products

//		for(int i=0; i<=2;i++){
//			  try{
//			     driver.findElement(By.xpath("//a[@href=\\\"index.php?module=Products&action=index\\\"]")).click();
//			     break;
//			  }
//			  catch(Exception e){
//			     System.out.println(e.getMessage());
//			  }
//			}

//		driver.findElement(By.xpath("//a[@href="index.php?module=Products&action=index"]")).click();

		driver.findElement(By.xpath("//a[@href=\"index.php?action=ListView&module=Products&parenttab=Inventory\"]"))
				.click();
//		productpage.click();
//		wUtil.waitForElementtobeVisible(driver, productpage);
//		Thread.sleep(4000);
//		driver.navigate().refresh();

		// loging out
		// mouse hovering to singout image

//		Thread.sleep(4000);
////		Actions a = new Actions(driver);
//		WebElement logout = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
//		wUtil.mouseOver(driver, logout);

//		a.moveToElement(logout).perform();
//		Thread.sleep(2000);
		// click on signout
//		driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
//		Reporter.log("loged out and closed", true);
//		driver.close();

//		driver.close();

	}

}

package com.vtiger.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ContactWithOrganization {

	public static void main(String[] args) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@href=\"index.php?module=Contacts&action=index\"]")).click();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		WebElement surname = driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));

		Select s1 = new Select(surname);
		s1.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("second");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("name");
		driver.findElement(By.xpath(
				"//input[@name=\"account_name\"]//following-sibling::img[@src=\"themes/softed/images/select.gif\"]"))
				.click();

//		Set<String> window = driver.getWindowHandles();
//    	Iterator<String> it = window.iterator();
//    	while(it.hasNext())
//    	{
//    		String winID=it.next();
//    		String title = driver.switchTo().window(winID).getTitle();
//    		if(title.contains(partialWinTitle))
//    		{
//    			break;
//    		}
//    	}

		Set<String> allWinAddr = driver.getWindowHandles();
		System.out.println("----allWinAddr.size()-----"+allWinAddr.size());
		String parentTitle = driver.getTitle();

		String parentwindow = driver.getWindowHandle();

		for (String oneWinAddr : allWinAddr) {
			String oneTitle = driver.switchTo().window(oneWinAddr).getTitle();
			if (!oneTitle.equals(parentTitle)) {
				driver.switchTo().window(oneWinAddr);
				Thread.sleep(3000);

				driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("autoentry2");
				driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[text()=\"autoentry2\"]")).click();
				System.out.println("cntrol went to child window");

			}
		}
		Thread.sleep(10000);
		driver.switchTo().window(parentwindow);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@class=\"crmButton small save\"]")).click();
		Thread.sleep(3000);

		Actions ac = new Actions(driver);
		WebElement icon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		ac.moveToElement(icon).perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		driver.close();
	}
}
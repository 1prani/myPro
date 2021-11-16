package com.amazon.mobileprice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W3schoolsTable{
	
	@Test
	public void w3schoolsTable() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//to get the number of rows and coloums and store them in the
		//list of webelement when we dont know how many nubmer of rows and 
		//coloums are there then we can use that way
		
		
		 WebElement all = driver.findElement(By.xpath("//table//tbody"));
		System.out.println(all.getText());
		
		
		
		
		
		
		
		
	}
	

}

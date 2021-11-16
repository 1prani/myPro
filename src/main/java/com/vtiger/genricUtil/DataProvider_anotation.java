package com.vtiger.genricUtil;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProvider_anotation {

	@org.testng.annotations.DataProvider
	public Object[][] sendData() {

		
		Object[][] ob = new Object[3][2];

		ob[0][0] = "testNG";
		ob[0][1] = 1;
		

		ob[1][0] = "testNGg";
		ob[1][1] = 12;
		

		ob[2][0] = "testNGgg";
		ob[2][1] = 123;
//		ob[2][2] = "--------";

		return ob;

	}
	@Test(dataProvider = "sendData")
	public void getData(String name, int balance)
	{
//		System.out.println(name+balance);
		Reporter.log("firstname------"+name+"\n the number------"+balance,true);
	}

}

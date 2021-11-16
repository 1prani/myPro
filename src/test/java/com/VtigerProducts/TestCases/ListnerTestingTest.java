package com.VtigerProducts.TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genricUtil.BaseClass;
@Listeners(com.vtiger.genricUtil.ListnerImp.class)
public class ListnerTestingTest extends BaseClass {
	@Test
	public void listTesting() {
		
		System.out.println(10/0);
		
	}

}

package com.VtigerProducts.TestCases;

import org.testng.annotations.Test;

import TestNG.Practice.SampleTest;

public class preorityPracticeTest  extends SampleTest {
	
	
	@Test(priority=2)
	public void firstmethod() {
		System.out.println("--------first method executed");
		
	}

	@Test(dependsOnMethods ="firstmethod") 
	public void secondmethod() {
		System.out.println("---------second method ");
	}
	

	@Test()
	public void thirdmethod() {
		System.out.println("--------third method executed");
		
	}
	
	
	@Test(invocationCount = 3)
	public void meth() {
		System.out.println("this is from invocaton method");
	}
		
		//depends on 
		@Test(enabled = false)
		public void meth2() {
			System.out.println("this is from enabled method");
			
		}
		
		//enabled equal to 
		//invoxation count=5
		
		
		
		
		
	}


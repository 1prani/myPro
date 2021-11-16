package com.vtiger.genricUtil;

import java.util.Random;

public class JavaUtility {
	
	public static int genrandomnumber() {
		
		Random r = new Random();
		return  r.nextInt(1000);
		
	}

}

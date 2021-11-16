package com.vtiger.genricUtil;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFIleUtility {

	public String propertyFileUtility(String key) throws Throwable {
		
		
		FileInputStream fis = new FileInputStream("./Data/commondataSDET_2.properties");
		
		// object for property file
		
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

}

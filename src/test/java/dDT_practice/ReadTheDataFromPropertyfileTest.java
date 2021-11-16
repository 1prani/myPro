package dDT_practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadTheDataFromPropertyfileTest {

	@Test
	public void readTheDataPropertyfiletest() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/commondataSDET_2.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("user");
		String pwd = p.getProperty("pass");
		System.out.println(url+" \n "+un+" \n "+pwd+" \n ");
		
		System.out.println("this if from property file test");
		
	}

}

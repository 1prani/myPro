package dDT_practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadParametersFromXMLFileTest {
	
	
	@Test
	public void readParametersFromXMLFileTest(XmlTest xml) {
		
		String url = xml.getParameter("url");
		String user = xml.getParameter("usserr");

		
		System.out.println("this is from xml file");
		System.out.println(url);
		System.out.println(user);

		
		
		
		
		
	}

}

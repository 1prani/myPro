package dDT_practice;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadtheDataFromJSONFileTest {

	

	@Test
	public void readDataFromJSONFileTest() throws Throwable, Throwable {
		FileReader fr = new FileReader("./Data/commondata.json");

		JSONParser jps = new JSONParser();

		Object pa = jps.parse(fr);
		HashMap hm = (HashMap)pa;
		
		Object vlaue = hm.get("url");
		System.out.println(vlaue);
		
		
		

	}

}

package com.vtiger.genricUtil;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class JSONFileUtilty {

	public String jsonfileutility(String key) throws Throwable {

		FileReader fir = new FileReader(IPathConstansts.JSONFILEPAT);
		
		JSONParser jp = new JSONParser();
		
		Object jobj = jp.parse(fir);

		HashMap obj = (HashMap) jobj;

		Object value = obj.get(key);

		return (String) value;

	}

}

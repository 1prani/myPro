package com.vtiger.genricUtil;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String excelUtility(String sheetname, int rownum, int cellnum) throws Throwable  {
		
		
		FileInputStream fis = new FileInputStream(IPathConstansts.EXCELPATH);
		 
		Workbook wb = WorkbookFactory.create(fis);
		 
		String value = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		 
		 return value;
		 
		
		
	}

}

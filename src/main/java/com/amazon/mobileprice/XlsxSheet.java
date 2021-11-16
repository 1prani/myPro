package com.amazon.mobileprice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.testng.annotations.Test;

public class XlsxSheet {

	public static void main(String args[]) throws Throwable {

		FileInputStream fis = new FileInputStream("./Data/VtigerTestData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		int lastrownum = wb.getSheet("Sheet2").getLastRowNum();

		for (int i = 1; i <= lastrownum; i++) {

String salry =  wb.getSheet("Sheet2").getRow(i).getCell(2).getStringCellValue();

			int parsedInteger = Integer.parseInt(salry);

			if (parsedInteger > 50000) {

				String name = wb.getSheet("Sheet2").getRow(i).getCell(1).getStringCellValue();
				System.out.println(name);

			}
		}

	}

}

package com.group4.ictak.website.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
    
	private static XSSFWorkbook excelWbook;
	private static XSSFSheet excelWsheet;
	public static String getCellData(int rowNo,int colNo) throws IOException
	{
		FileInputStream ExcelFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources"+"/studentDetails.xlsx");
		excelWbook=new XSSFWorkbook(ExcelFile);
		excelWsheet=excelWbook.getSheetAt(0);
		return excelWsheet.getRow(rowNo).getCell(colNo).getStringCellValue();
	}
	
}


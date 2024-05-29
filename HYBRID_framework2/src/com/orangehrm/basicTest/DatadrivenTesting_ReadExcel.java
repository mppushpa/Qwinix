package com.orangehrm.basicTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DatadrivenTesting_ReadExcel implements	FrameworkConstants
{
public static String Readdata(String sheet,int row,int cell) throws Exception
{
	FileInputStream fis= new FileInputStream(Excel_path);
	Workbook book=WorkbookFactory.create(fis);
	Cell cel = book.getSheet(sheet).getRow(row).getCell(cell);
	String value = cel.getStringCellValue().toString();
	return value;
	
}
}

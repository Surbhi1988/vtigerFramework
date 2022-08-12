package com.crm.Sdet.genericLib;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory; 

public class ExcelUtility{
	/*This method is used fetch data from excel sheet
	 * *Author surbhi
	 */
	public String getdataFromExcel(String sheetName,int RowNum,int CellNum) throws EncryptedDocumentException, Throwable {
	FileInputStream fis=new FileInputStream("./src/test/resources/book1.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);
	
	//Sheet sheet = wb.getSheet(sheetName);
	// Row row = sh.getRow(RowNum);
   // Cell cell = row.getCell(CellNum);
   // String data = cell.getStringCellValue();
     //return data;
	DataFormatter format=new DataFormatter();
	return format.formatCellValue(wb.getSheet(sheetName).getRow(RowNum).getCell(CellNum));
     
}
}
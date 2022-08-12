package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/book2.xlsx");
	//open workbook to read 
     Workbook wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet("sheet1");
     int I = sh.getLastRowNum();
     for(int i=0;i<I;i++);
	
	{
		//get the control of row
    	Row row=sh.getRow(1);
    	//get the control of cell
     Cell cell = row.getCell(0);
     Cell cell1 = row.getCell(1);
    Cell cell2 = row.getCell(2);
         String data = cell.getStringCellValue();
        String data1 = cell1.getStringCellValue();
       String data2 = cell2.getStringCellValue();
       
       
    System.out.println(data);
        System.out.println(data1);
      System.out.println(data2);
	}

}
}

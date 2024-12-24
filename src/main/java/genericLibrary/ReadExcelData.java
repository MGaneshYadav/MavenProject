package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData implements FrameworkConstants {
	
	public static String singleRead(String sheetName,int rowNum,int colNum) throws EncryptedDocumentException, IOException
	{
		File file =new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(sheetName);
		return sheet.getRow(rowNum).getCell(colNum).toString();
	}
		
	public static Object[][] multipleRead(String SheetName) throws EncryptedDocumentException, IOException
	{
		File file =new File(EXCEL_PATH);
		FileInputStream fis=new FileInputStream(file);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet(SheetName);
		int rowNum=sheet.getPhysicalNumberOfRows();
		int colNum=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowNum-1][colNum];
		for(int i=0;i<rowNum-1;i++) 
		{
			for(int j=0;j<colNum;j++) 
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}

	
}

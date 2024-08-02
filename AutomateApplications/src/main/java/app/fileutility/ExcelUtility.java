package app.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
		public String getdatafromexcel(String sheetName, int rowNum,int cellNum) throws EncryptedDocumentException, Throwable {
			FileInputStream fis=new FileInputStream("./file/data.xlsx");
			  Workbook wb=WorkbookFactory.create(fis);
			 String data= wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue(); 
			 wb.close();
			return data;
		}
		public int getrowcount() throws Throwable {
			FileInputStream fis=new FileInputStream("./file/data.xlsx");
			  Workbook wb=WorkbookFactory.create(fis);
		 int rowcount= wb.getSheet("sheentame").getLastRowNum();
		 wb.close();
		 return rowcount;	
		}
		public void setdataintoexcel(String sheetName,int celNum,String data) throws Throwable {
			FileInputStream fis=new FileInputStream("./file/data.xlsx");
			  Workbook wb=WorkbookFactory.create(fis);
			  wb.getSheet(sheetName).getRow(celNum).createCell(celNum);
			  FileOutputStream fos=new FileOutputStream("");
			  wb.write(fos);
			  wb.close();

	}

	}


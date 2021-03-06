package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ReadExceL {
	//private WebDriver driver;
	private  static HSSFWorkbook workbook;
	private static HSSFSheet sheet ;
    
	//@Test(priority = 0)
	public static  void setExcelFile() throws IOException {
		
		FileInputStream file = new FileInputStream(new File("C:\\Excel\\Test.xls"));
		workbook = new HSSFWorkbook(file);
	    sheet = workbook.getSheetAt(0);
		
	}
	
	//@Test(priority  = 1)
	public static String getCellData(int rowNum , int colNum) {
		return sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		
	}
	
	//@Test(priority = 2)
	public static void  setExcelData(String result , int rowNum ,int colNum) throws IOException   {
		  FileInputStream file = new FileInputStream(new File("C:\\Excel\\Test.xls"));
		    workbook = new HSSFWorkbook(file);
		    sheet = workbook.getSheetAt(0);
			sheet.getRow(0).createCell(4).setCellValue("Result");
			sheet.getRow(rowNum).createCell(colNum).setCellValue(result);
            
			FileOutputStream out = new FileOutputStream(new File("C:\\Excel\\Test.xls"));
			workbook.write(out);
			out.close();
	}
	
	

}

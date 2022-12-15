package com.excelr.browserstack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;



public class Demo5 {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static int numofRows;
	
	public static void main(String[] args) throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\1304235\\eclipse-workspace\\Hybrid Driven Excel Frmework\\src\\com\\excelr\\utilities\\Hybriddriven.xlsx");
		book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(0);
		
		//To fetch the number of rows
		numofRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numofRows);
	}

}

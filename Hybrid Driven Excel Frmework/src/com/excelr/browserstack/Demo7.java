package com.excelr.browserstack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	public static int numofRows;
	public static String action;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String data;
	
	public static String getCellValues(int rownum,int cellnum)
	{
		row = sheet.getRow(rownum);
		cell = row.getCell(cellnum);
		data = cell.getStringCellValue();
		return data;
	}
	public static void main(String[] args) throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\1304235\\eclipse-workspace\\Hybrid Driven Excel Frmework\\src\\com\\excelr\\utilities\\Hybriddriven.xlsx");
		book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(0);
		
		//To fetch the number of rows
		numofRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numofRows);
		
		for (int i = 1; i < numofRows; i++)
		{
			action = getCellValues(i,2);
			System.out.println(action);	
		
		switch(action)
		
		{
		case "open":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			break;
			
		case "navigate":
			driver.get(getCellValues(i,4));
			break;
			
		case "click":
			driver.findElement(By.xpath(getCellValues(i,3))).click();
			break;
			
		case "type":
			driver.findElement(By.xpath(getCellValues(i,3))).sendKeys(getCellValues(i,4));
			break;
			
		case "quit":
			driver.quit();
			break;
		
		}
	  }
			
	}	

}

package com.excelr.launches;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsappBulk
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		
		//SCAN the QR code within 10 seconds 
		Thread.sleep(15000);
						
		// Refreshing the web page
		driver.navigate().refresh();
		Thread.sleep(10000);
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumTest\\src\\com\\excelr\\utilities\\Log1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int i = 1;; i++)
		{
			Row row = sheet.getRow(i);
			
			if(row == null)
			{
				break;
			}
			
			String phoneNum = new BigDecimal(row.getCell(0).toString()).toString();
			String message = row.getCell(1).toString();
			// To Identify Search Bar
			WebElement search_bar = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
			Thread.sleep(5000);
			
			search_bar.sendKeys(phoneNum);
			search_bar.sendKeys(Keys.ENTER);
			
			// To Identify message_bar
			WebElement message_bar = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text']"));
			Thread.sleep(8000);
			message_bar.sendKeys(message);
			message_bar.sendKeys(Keys.ENTER);	
			
			System.out.println(phoneNum);
			System.out.println(message);
		}
			
	}
}
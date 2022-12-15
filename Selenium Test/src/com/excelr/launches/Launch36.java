package com.excelr.launches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch36 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\1304235\\Desktop\\ExcelR\\Selenium\\HTML\\Tables.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='tab']/tbody/tr"));
		int row_size = rows.size();
		System.out.println(row_size); // 3
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='tab']/tbody/tr[1]/td"));
		int column_size = columns.size();
		System.out.println(column_size); // 2
		
		for (int i = 1; i <=row_size; i++) 
		{
			WebElement cname = driver.findElement(By.xpath("//table[@id='tab']/tbody/tr["+i+"]/td[1]"));
			System.out.println(cname.getText());
		}
	}

}

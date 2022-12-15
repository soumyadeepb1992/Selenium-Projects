package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch40
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.browserstack.com");
		driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh(); 
		Thread.sleep(5000);
		driver.navigate().forward(); 
		Thread.sleep(5000);
		driver.close();
	}	
				
}
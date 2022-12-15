package com.excelr.launches;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhatsApp
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://web.whatsapp.com/");
		
		//SCAN the QR code within 10 seconds 
		Thread.sleep(20000);
						
		// Refreshing the web page
		driver.navigate().refresh();
		Thread.sleep(10000);
		
		// To Identify Search Bar
		WebElement search_bar = driver.findElement(By.xpath("//div[@title='Search input textbox']"));
		Thread.sleep(5000);
		
		search_bar.sendKeys("9630561465");
		search_bar.sendKeys(Keys.ENTER);
		
		// To Identify message_bar
		WebElement message_bar = driver.findElement(By.xpath("//p[@class='selectable-text copyable-text']"));
		Thread.sleep(8000);
		message_bar.sendKeys("Hey Monkey");
		message_bar.sendKeys(Keys.ENTER);		
		
		
	}
}

package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch27
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Selenium Webdriver\\HTML\\page1.html");
		
		Thread.sleep(5000);
			
		WebElement link = driver.findElement(By.linkText("Go to child page"));
		link.click();
		Thread.sleep(5000);
		
		driver.quit();
	}
}
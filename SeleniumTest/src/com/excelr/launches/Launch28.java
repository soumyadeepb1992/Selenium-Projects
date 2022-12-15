package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch28
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Selenium Webdriver\\HTML\\Login.html");
		
		Thread.sleep(5000);
			
		WebElement un = driver.findElement(By.xpath("/html/body/input[1]"));
		un.sendKeys("sandesh");
		Thread.sleep(3000);
		
		WebElement pwd = driver.findElement(By.xpath("/html/body/input[2]"));
		pwd.sendKeys("12345");
		Thread.sleep(3000);
		driver.close();
		
	}
}
package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch35_FrameSwitch {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\1304235\\Desktop\\ExcelR\\Selenium\\HTML\\Page002.html");
		
		WebElement mname = driver.findElement(By.id("mname"));
		mname.sendKeys("Shree");
		
		// driver.switchTo().frame(0);
		// driver.switchTo().frame("New Entry");
		
		driver.switchTo().frame("nameinfo");
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Bhavya");	
	}

}

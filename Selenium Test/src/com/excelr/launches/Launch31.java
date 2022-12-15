package com.excelr.launches;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch31 {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\1304235\\Desktop\\ExcelR\\Selenium\\HTML\\Page01.html");
	
	WebElement link1 = driver.findElement(By.linkText("Go to Page 2"));
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	Thread.sleep(3000);
	link1.click();
	Thread.sleep(3000);
	
	WebElement link2 = driver.findElement(By.xpath("//a[text()='Go to Page 3']"));
	Thread.sleep(3000);
	link2.click();
	
	}

}

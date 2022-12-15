package com.excelr.launches;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch33_WindowsHandles {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\Users\\1304235\\Desktop\\ExcelR\\Selenium\\HTML\\Page01.html");
	
	WebElement link1 = driver.findElement(By.linkText("Go to Page 2"));
	Thread.sleep(5000);
	link1.click();
	Thread.sleep(5000);
	
	// Code to fetch the address of Parent Tab
	String P_addr = driver.getWindowHandle();
	System.out.println(P_addr);
	
	// Code to fetch the address of Parent Tab as well as Child Tab
	Set<String> P_C_addr = driver.getWindowHandles();
	System.out.println(P_C_addr);
	
	ArrayList<String> a = new ArrayList<String>(P_C_addr);
	System.out.println(a);
	
	driver.switchTo().window(a.get(1));
	
	WebElement link2 = driver.findElement(By.linkText("Go to Page 3"));
	Thread.sleep(5000);
	link2.click();
	Thread.sleep(5000);
	
	
	}

}

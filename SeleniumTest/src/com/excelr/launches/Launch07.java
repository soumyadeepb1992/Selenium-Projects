package com.excelr.launches;

import org.openqa.selenium.chrome.ChromeDriver;

class Launch07
{
	public static void main(String[] args) 
	{
	
	//Open the Chrome Browser
	//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Components\\chromedriver.exe");
	
	ChromeDriver driver = new  ChromeDriver();
		
	//Navigate to Gmail Application
	driver.get("https://www.gmail.com");
	
	String ps = driver.getPageSource();
	
	System.out.println(ps);
	
	// Close the Browser
	driver.close();
	
	}
}
package com.excelr.launches;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch06_GetURL {
	public static void main(String[] args) 
	{
	
	//Open the Chrome Browser
	//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Components\\chromedriver.exe");
	
	ChromeDriver driver = new  ChromeDriver();
		
	//Navigate to Gmail Application
	driver.get("https://www.gmail.com");
	
	String curl = driver.getCurrentUrl();
	
	System.out.println(curl);
	
	// Close the Browser
	driver.close();
		
	}

}

package com.excelr.launches;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch04_NavigateURL {
	public static void main(String[] args) throws InterruptedException
	{
	//Open the Chrome Browser
	//System.setProperty("webdriver.chrome.driver","E:\\Excelr_Selenium_Sep7\\Selenium Components\\chromedriver.exe");
	
	ChromeDriver driver = new  ChromeDriver();
	
	String url = "https://www.gmail.com";
	
	//Navigate to Gmail Application
	driver.get(url);
	
	//Provide 5 seconds Delay
	Thread.sleep(5000);
	
	// Close the Browser
	driver.close();
		
		}

}

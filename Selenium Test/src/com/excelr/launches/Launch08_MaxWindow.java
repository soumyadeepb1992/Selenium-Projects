package com.excelr.launches;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch08_MaxWindow {
	public static void main(String[] args) throws InterruptedException 
	{
	
	//Open the Chrome Browser
	//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Components\\chromedriver.exe");
	
	ChromeDriver driver = new  ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.gmail.com");
	
	Thread.sleep(5000);
	
	driver.close();
	
	}


}

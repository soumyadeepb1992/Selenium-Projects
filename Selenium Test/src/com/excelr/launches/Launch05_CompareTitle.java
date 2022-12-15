package com.excelr.launches;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch05_CompareTitle {
	public static void main(String[] args)
	{
		System.out.println("Enter the Title");
		
		Scanner scan = new Scanner(System.in);
		String etitle = scan.next();
		
		//Open the Chrome Browser
		//System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium Components\\chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		
		//Navigate to Gmail Application
		driver.get("https://www.gmail.com");
		
		String atitle = driver.getTitle();
		
		// Close the Browser
		driver.close();
		
		System.out.println("Expected Title : "+etitle);
		System.out.println("Actual Title : "+atitle);
			
		if (etitle.equals(atitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}	
	}

}

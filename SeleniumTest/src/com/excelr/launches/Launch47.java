//WAS to count the total number of links in the https://www.browserstack.com WebPage. 
//After displaying the count iterate through all the links and display the LinkText associated with all the links 
package com.excelr.launches;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch47
{
	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.browserstack.com");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			int size = links.size();
			System.out.println(size);
			
			for (int i = 0; i<size ; i++)
			{
			String text  = links.get(i).getText();
			System.out.println(text);
			}
			
			driver.close();
	}
}
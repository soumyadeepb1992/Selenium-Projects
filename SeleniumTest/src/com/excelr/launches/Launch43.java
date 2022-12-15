package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch43
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.webmath.com/");
		
		WebElement link = driver.findElement(By.linkText("General Math"));
		link.click();
		Thread.sleep(5000);
		
		Select se = new Select(driver.findElement(By.cssSelector("select[id*='topicItem']")));
		se.selectByVisibleText("Interest, Simple");
		
		Thread.sleep(5000);
		driver.close();
	}				
}
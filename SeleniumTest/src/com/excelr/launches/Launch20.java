package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch20
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.cssSelector("input.inputtext"));
		email.sendKeys("sandeshhs6460@gmail.com");
	}
}
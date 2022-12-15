package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch23
{
	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		WebElement email = driver.findElement(By.cssSelector("input[id ^= 'iden']"));
		email.sendKeys("sandeshhs6460@gmail.com");
	}
}
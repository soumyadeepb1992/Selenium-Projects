package com.excelr.launches;

//WAS to navigate to the Facebook application and type the email in the email field using "id" locator


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Launch13
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sandeshhs6460@gmail.com");
	}
}
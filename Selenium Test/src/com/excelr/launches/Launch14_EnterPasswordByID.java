package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch14_EnterPasswordByID {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement password= driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		Thread.sleep(3000);
		driver.close();
		
		
	}

}

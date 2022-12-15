package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch15_EnterByName {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("soumyadeep.biswal@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		
	}

}

package com.excelr.launches;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).pause(3000).moveToElement(driver.findElement(By.xpath("//span[@class='nav-action-inner']"))).click().build().perform();
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("soumyadeep.biswal@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Micro@100");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		

	}

}

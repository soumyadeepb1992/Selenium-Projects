package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch42
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com");
		driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("sandeshhs6460@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("12345678");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(5000);
		WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']")).click();
		driver.close();
	}	
				
}
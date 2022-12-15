package com.excelr.browserstack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Establishing the Connection from Property File to Java File
		FileInputStream fis = new FileInputStream("C:\\Users\\1304235\\eclipse-workspace\\Keyword Driven Framework\\src\\com\\excelr\\utilities\\keyworddriven.properties");
		
		// Creation of Properties object to load the data
		Properties p = new Properties();
		p.load(fis);
		
		//Fetching the data from a Property File
		String signin_x_data = p.getProperty("signin");
		String email_x_data = p.getProperty("email");
		String password_x_data = p.getProperty("password");
		String cookie_x_data = p.getProperty("cookie");
		String signmein_x_data = p.getProperty("signmein");
		String menu_x_data = p.getProperty("menu");
		String logout_x_data = p.getProperty("logout");
				
		System.out.println(signin_x_data);
		System.out.println(email_x_data);
		System.out.println(password_x_data);
		System.out.println(cookie_x_data);
		System.out.println(signmein_x_data);
		System.out.println(menu_x_data);
		System.out.println(logout_x_data);
		
		driver.get("https://www.browserstack.com");
		driver.findElement(By.xpath(signin_x_data)).click();
		driver.findElement(By.xpath(email_x_data)).sendKeys("sandeshhs6460@gmail.com");
		driver.findElement(By.xpath(password_x_data)).sendKeys("12345678");
		Thread.sleep(5000);
		driver.findElement(By.xpath(cookie_x_data)).click();
		driver.findElement(By.xpath(signmein_x_data)).click();
		Thread.sleep(5000);
		WebElement b = driver.findElement(By.xpath(menu_x_data));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		driver.findElement(By.xpath(logout_x_data)).click();
		driver.close();
	}			
}



package com.excelr.BrowserStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Establishing the Connection from Property File to Java File
		FileInputStream fis = new FileInputStream("C:\\Users\\1304235\\eclipse-workspace\\Data Driven Framework\\src\\com\\excelr\\utilities\\datadriven.properties");
		
		// Creation of Properties object to load the data
		Properties p = new Properties();
		p.load(fis);
		
		//Fetching the data from a Property File
		String url_data = p.getProperty("url");
		String email_id_data = p.getProperty("email");
		String pwd_data = p.getProperty("password");
				
		System.out.println(url_data);
		System.out.println(email_id_data);
		System.out.println(pwd_data);
		
		driver.get(url_data);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("user_email_login")).sendKeys(email_id_data);
		driver.findElement(By.id("user_password")).sendKeys(pwd_data);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']")).click();
		driver.close();
	}

}

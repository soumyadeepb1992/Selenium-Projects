package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch41 {
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com");
		
		WebElement sign_in = driver.findElement(By.linkText("Sign in"));
		sign_in.click();
		
		WebElement un = driver.findElement(By.id("user_email_login"));
		WebElement pwd = driver.findElement(By.id("user_password"));
		
		un.sendKeys("sandeshhs6460@gmail.com");
		pwd.sendKeys("12345678");
		
		Thread.sleep(5000);
		
		WebElement accept = driver.findElement(By.xpath("//button[@id='accept-cookie-notification']"));
		accept.click();
		
		WebElement login = driver.findElement(By.name("commit"));
		login.click();
	
		Thread.sleep(5000);
		
		WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		
		WebElement logout = driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']"));
		logout.click();
	
		driver.close();
	
	}	

}

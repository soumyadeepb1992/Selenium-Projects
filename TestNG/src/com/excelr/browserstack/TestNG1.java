package com.excelr.browserstack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.browserstack.com");
	}
	
	@Test
	public void Credentails1()
	{
	driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("sandeshhs6460@gmail.com");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("12345678");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
	Actions a = new Actions(driver);
	a.moveToElement(b).build().perform();
	driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']")).click();
	
	}
	
	@Test
	public void Credentails2()
	{
		driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("mrgarunkumar8892@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Aru@8892");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}

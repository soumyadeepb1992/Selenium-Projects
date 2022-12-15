package com.excelr.launches;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launch46_ExplicitWait {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com");
		driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("sandeshhs6460@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("12345678");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		
		driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']")).click();
		driver.close();
	
		
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement sign_out = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign out")));
		sign_out.click();
				
		driver.close();
	}

}

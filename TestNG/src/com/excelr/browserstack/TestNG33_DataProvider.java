package com.excelr.browserstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG33_DataProvider {
	@DataProvider(name = "authentication")
	public Object[][] dataProviders()
	{
		Object[][] obj = new Object[2][2];

		obj[0][0] = "sandeshhs6460@gmail.com";
		obj[0][1] = "12345678";

		obj[1][0] = "shalinihs85@gmail.com";
		obj[1][1] = "shalini080685";

		return obj;
	}

	@Test(dataProvider = "authentication")
	public void positiveCredentialsBrowserStack1(String email_id, String pwd)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com");
		driver.findElement(By.xpath("(//a[@title='Sign In'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(email_id);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement b = driver.findElement(By.xpath("//button[@id='account-menu-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();
		driver.findElement(By.xpath("//a[@title='Sign out' and @id ='sign_out_link']")).click();
		driver.close();
	}		

}

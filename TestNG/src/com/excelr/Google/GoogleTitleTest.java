package com.excelr.Google;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		
	}
	
	
	@Test
	public void googleTitleTest() {
		System.out.println("Enter expected title :");
		Scanner sc = new Scanner(System.in);
		String etitle=sc.next();
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(etitle, Title, "Title is not matching");
	}
	
	@Test
	public void googlelogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		
		Assert.assertTrue(b);
		Assert.assertEquals(b, true, "Logo not found");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}

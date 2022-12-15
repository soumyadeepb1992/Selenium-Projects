package com.excelr.Google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	
	@Test(priority = 2, groups = "Logo" )
	public void googlelogoTest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	}
	
	@Test(priority = 3, groups = "Link")
	public void googlemaillinktest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority = 4, groups = "Test")
	public void Test1() {
		System.out.println("Test 1 executed");
	}
	
	@Test(priority = 5, groups = "Test")
	public void Test2() {
		System.out.println("Test 1 executed");
	}
	
	@Test(priority = 6, groups = "Test")
	public void Test3() {
		System.out.println("Test 1 executed");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}

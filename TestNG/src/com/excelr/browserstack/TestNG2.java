package com.excelr.browserstack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method Executed");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method Executed");
	}
	
	@Test   // TestCase 1
	public void positiveCredentails1()
	{
		System.out.println("Inside Positive Credentails 1");
	}
	@Test   // TestCase 2
	public void positiveCredentails2()
	{
		System.out.println("Inside Positive Credentails 2");
	}

}

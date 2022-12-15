package com.excelr.Google;

import org.testng.annotations.Test;

public class TestNGFeatures_dependsOn {
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		//int i = 9/0;
	}
	
	@Test(priority = 1)
	public void HomePageTest() {
		System.out.println("HomePageTest");
	}
	
	@Test(priority = 2, groups="Pages", dependsOnMethods = "loginTest")
	public void RegTest() {
		System.out.println("RegTest");
	}
	
	@Test(priority = 1, groups = "Pages", dependsOnMethods = "loginTest")
	public void SearchPageTest() {
		System.out.println("SearchPageTest");
	}

}

package com.excelr.launches;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch29 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		Dimension dim = driver.manage().window().getSize();
		System.out.println(dim);
		System.out.println("The Width:  "+ dim.width);
		System.out.println("The Height:  "+ dim.height);
		
		Dimension new_half_dim = new Dimension(dim.width/2,dim.height/2);
		System.out.println("The New Width:  "+new_half_dim.width);
		System.out.println("The New Height:  "+new_half_dim.height);
		
		//To set the size of the window
		driver.manage().window().setSize(new_half_dim);
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
package com.excelr.browserstackpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Sign in'])[1]") 
	WebElement	sign_in;
	
	public Welcome (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignIn()
	{
		
		sign_in.click();
	}

}

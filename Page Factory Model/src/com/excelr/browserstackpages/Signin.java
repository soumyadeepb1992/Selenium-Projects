package com.excelr.browserstackpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
WebDriver driver;
	
	@FindBy(xpath = "//input[@id = 'user_email_login']") 
	WebElement	email;
	
	@FindBy(xpath = "//input[@id = 'user_password']") 
	WebElement	password;
	
	@FindBy(xpath = "//button[@id='accept-cookie-notification']") 
	WebElement	accept_cookie;
	
	@FindBy(xpath = "(//input[@name= 'commit'])[1]") 
	WebElement	signme_in;
	
	public Signin (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String e)
	{
		email.sendKeys(e);
	}
	public void typePassword(String p)
	{
		password.sendKeys(p);
	}
	public void acceptCookie()
	{
		accept_cookie.click();
	}
	public void signMeIn()
	{
		signme_in.click();
	}

}

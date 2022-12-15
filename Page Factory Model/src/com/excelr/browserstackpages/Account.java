package com.excelr.browserstackpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account {
WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Sign out' and @id ='sign_out_link']")
	WebElement	sign_out;
	
	public Account (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void accounButtonHover()
	{
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[@id='account-menu-toggle']"))).build().perform();
		
	}
	public void signOut()
	{
		sign_out.click();
	}

}

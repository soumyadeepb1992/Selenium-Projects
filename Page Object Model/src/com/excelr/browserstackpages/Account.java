package com.excelr.browserstackpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Account {
	WebDriver driver;
	By sign_out = By.xpath("//a[@title='Sign out' and @id ='sign_out_link']");
	
	public Account (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void accounButtonHover()
	{
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//button[@id='account-menu-toggle']"))).build().perform();	
	}
	public void signOut()
	{
		driver.findElement(sign_out).click();
	}

}

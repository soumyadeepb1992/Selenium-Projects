package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch37_CursorMoveTo {
	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://www.amazon.in/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement all = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		all.click();
		
		WebElement e_a = driver.findElement(By.xpath("//div[contains(text(),'Echo & Alexa')]"));
		WebElement all_e_a = driver.findElement(By.xpath("//a[contains(text(),'All-new Echo Dot (4th Gen)')]"));

		Actions a = new Actions(driver);
		
		a.moveToElement(e_a).click().build().perform();
		Thread.sleep(5000);
		
		a.moveToElement(all_e_a).click().build().perform();
		Thread.sleep(5000);
		
		driver.close();
	}

}

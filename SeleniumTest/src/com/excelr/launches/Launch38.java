package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch38
{
	public static void main(String[] args) throws InterruptedException
	{
		String url = "https://www.myntra.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement men = driver.findElement(By.xpath("(//a[(text() = 'Men')])[1]"));
		WebElement Sweatshirts = driver.findElement(By.xpath("(//a[contains(text(),'Sweatshirts')])[1]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(men).build().perform();
		Thread.sleep(5000);
		
		a.moveToElement(Sweatshirts).click().build().perform();
		Thread.sleep(5000);
		
		driver.close();
	}
		
}
//WAS to get the LinkText, Tagname and Attribute of the web element

package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch30
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spotify.com/");
		Thread.sleep(5000);
		
		WebElement l1 = driver.findElement(By.linkText("Log in"));
		l1.click();
		System.out.println(l1.getText());
		System.out.println(l1.getAttribute("href"));
		System.out.println(l1.getTagName());
	}
}
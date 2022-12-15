package com.excelr.launches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch30 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spotify.com/");
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		
		WebElement l1 = driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 kuwYvr encore-inverted-light-set']"));
		l1.click();
		System.out.println(l1.getText());
		System.out.println(l1.getAttribute("class"));
		System.out.println(l1.getTagName());
	}

}

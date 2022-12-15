package com.excelr.launches;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //Launch Chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete all the cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40000));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.navigate().refresh();  
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("java");
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
		System.out.println("Total number of suggestion = " + list.size());
		for(int i=0; i<=list.size();i++) {
			String text =list.get(i).getText();
			System.out.println(text);
		
			if(text.contains("javascript")) {
				list.get(i).click();
				break;
			}
		}
	}

}

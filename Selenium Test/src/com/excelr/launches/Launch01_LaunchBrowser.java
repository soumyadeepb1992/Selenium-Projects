package com.excelr.launches;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch01_LaunchBrowser {

	public static void main(String[] args) {
		//System.setProperty(key,value)
		//System.setProperty("webdriver.gecko.driver","C:\\Selenium Webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver d = new ChromeDriver();
		//FirefoxDriver f = new FirefoxDriver();
		d.get("http://www.google.com");
		d.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Fresco Play");
		d.findElement(By.xpath("//input[@class='gNO89b' and @value='Google Search' and @type='submit']")).sendKeys(Keys.ENTER);
		
	}

}

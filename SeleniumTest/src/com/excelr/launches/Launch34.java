package com.excelr.launches;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch34 
{
	public static void main(String[] args) throws InterruptedException
	{
		String url  = "http://demo.guru99.com/test/delete_customer.php";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		
		driver.findElement(By.name("cusid")).sendKeys("1435");	
		driver.findElement(By.name("submit")).submit();
		
		// Switching to Alert Window       
        Alert a = driver.switchTo().alert();
        
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();	
        System.out.println(alertMessage);	
 
        
       // Accepting the alert		
        a.accept();	 // to click on ok button
       
      // Dismiss the alert
      //a.dismiss();  // to click on cancel button 
		
	}
}
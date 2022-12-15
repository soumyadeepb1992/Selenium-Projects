package com.excelr.browserstackautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelr.browserstackpages.Account;
import com.excelr.browserstackpages.Signin;
import com.excelr.browserstackpages.Welcome;

public class Demo9 {
	public static void main(String[] args)
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.browserstack.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnSignIn();
		
		Signin s = new Signin(driver);
		s.typeEmail("sandeshhs6460@gmail.com");
		s.typePassword("12345678");
		s.acceptCookie();
		s.signMeIn();
		
		Account a = new Account(driver);
		a.accounButtonHover();
		a.signOut();
		
		driver.close();
	}

}

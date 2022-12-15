//2. Write a Script to open Google Chrome browser by adding chromedriver using System.setProperty method

package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch2 {

	public static void main(String[] args) {
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver f= new  ChromeDriver();
			
			}

	}

}

package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch6 {

	public static void main(String[] args) {
		//Open the Chrome Browser
		//System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new  ChromeDriver();
			
		//Navigate to Gmail Application
		driver.get("https://www.gmail.com");
		
		String curl = driver.getCurrentUrl();
		
		System.out.println(curl);
		
		// Close the Browser
		driver.close();

	}

}

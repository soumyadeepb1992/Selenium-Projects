package seleniumTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch1 {

	public static void main(String[] args) {
		//System.setProperty(key,value)
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		FirefoxDriver f = new FirefoxDriver();

	}

}

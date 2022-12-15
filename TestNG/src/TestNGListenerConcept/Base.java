package TestNGListenerConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialisation() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	
	public void failed() {
		((TakeScreenshot)driver).
	}

}

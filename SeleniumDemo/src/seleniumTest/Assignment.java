package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement signin = 
		//		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.xpath("//*[@id=\"accept-cookie-notification\"]")).click();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[5]/a")).click();
		//signin.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().refresh(); 
		Thread.sleep(5000);
		driver.navigate().forward(); 
		Thread.sleep(5000);
		driver.close();
		
		
	}

}

package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium Webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.webmath.com");
		WebElement link = driver.findElement(By.linkText("General Math"));
		link.click();
		WebElement drop = driver.findElement(By.id("topicItem"));
		drop.click();
		// Selecting the drop-down 
				Select drop_down = new Select(driver.findElement(By.cssSelector("select[id *='topicItem']")));
				// matching the desired option[ Interest , simple]
				drop_down.selectByVisibleText("Interest, Simple");
				
				//Enter the principal amount
				WebElement p = driver.findElement(By.name("principal"));
				p.sendKeys("10000");
				
				//Enter the percent of interest 
				WebElement i = driver.findElement(By.name("interest"));
				i.sendKeys("10");
				
				//Enter the year 
				WebElement y = driver.findElement(By.name("desired_time"));
				y.sendKeys("1");
				
				//Click on Find the Amount of interest 
				WebElement f = driver.findElement(By.cssSelector("input[value='Find the amount of interest']"));
				f.click();
				
				//Wait for 5 seconds
				Thread.sleep(5000);
				
				//close the browser
				driver.close();

	}

}

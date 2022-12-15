import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Demo8 {

	@Test
	public void positiveCredentials() throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
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

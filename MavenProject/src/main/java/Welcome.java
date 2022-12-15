
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;
	By sign_in = By.xpath("(//a[text()='Sign in'])[1]");
	
	public Welcome (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickOnSignIn()
	{
		driver.findElement(sign_in).click();
	}

}

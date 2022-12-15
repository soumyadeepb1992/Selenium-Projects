
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signin {
	WebDriver driver;
	By email = By.xpath("//input[@id = 'user_email_login']");
	By password = By.xpath("//input[@id = 'user_password']");
	By accept_cookie = By.xpath("//button[@id='accept-cookie-notification']");
	By signme_in = By.xpath("(//input[@name= 'commit'])[1]");
	
	public Signin (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void typeEmail(String e)
	{
		driver.findElement(email).sendKeys(e);
	}
	public void typePassword(String p)
	{
		driver.findElement(password).sendKeys(p);
	}
	public void acceptCookie()
	{
		driver.findElement(accept_cookie).click();
	}
	public void signMeIn()
	{
		driver.findElement(signme_in).click();
	}

}

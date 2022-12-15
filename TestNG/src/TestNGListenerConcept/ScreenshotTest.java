package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {
	
	@BeforeMethod
	public void Setup() {
		
		
	}
	
	@AfterMethod
	public void TearDown() {
		
	}
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(false, true);
	}

}

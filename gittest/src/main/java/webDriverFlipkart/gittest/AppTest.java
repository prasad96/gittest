package webDriverFlipkart.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
	
	WebDriver driver ;
	
	public void openBrowser()
	{
		driver = new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		
		System.out.println("Browser opened");
	}

}

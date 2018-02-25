package PageFactoryTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass 
{
	public static WebDriver driver;
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
		
		driver = new FirefoxDriver();
		driver.get("http://staygrid.com/admine");
		
		PageClass pc = new PageClass();
		pc.adminLogin();
	}

}

package TwentythWeekend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CSSTesting 
{
	@Test
	public void google()
	{
		System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	//# for ID ex... input#lst-ib
	  	//driver.findElement(By.cssSelector("input[id='lst-ib']")).sendKeys("Download TestNG");
		driver.findElement(By.cssSelector("input.gsfi")).sendKeys("Download Selenium");
		//For Name
		driver.findElement(By.cssSelector("input[name='btnK']")).click();
				
	}

}

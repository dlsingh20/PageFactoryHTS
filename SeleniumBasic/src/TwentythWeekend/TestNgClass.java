package TwentythWeekend;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNgClass 
{	
	/*
	@BeforeSuite
	public void runBeforeSuite()
	{
		System.out.println("Run Before Suite");
	}
	
	@AfterSuite
	public void runAfterSuite()
	{
		System.out.println("Run After Suite");
	}	
	@BeforeTest
	public void runBeforeTest()
	{
		System.out.println("Run Before Test");
	}
	@AfterTest
	public void runAfterTest()
	{
		System.out.println("Run After Test");
	}
	@BeforeClass
	public void runBeforeClass()
	{
		System.out.println("run Before Class");
	}
	
	@AfterClass
	public void runAfterClass()
	{
		System.out.println("run After Class");
	}
	
	@BeforeMethod
	public void openNykaa()
	{
		System.out.println("run Before Method");
		//GMethods.launchURLAndBrowser("http://www.nykaa.com/");
	}
	
	@AfterMethod
	public void closeNykaa()
	{
		System.out.println("run after Method");
		//GMethods.driver.quit();
	}
	
	@Test(priority=1)
	public void verifyFacewash()
	{
		System.out.println("1st Test");
	}
	
*/	
	//@Test(priority=0)
	@Parameters("browser")
	public void verifyShampoo(String b)
	{		
	if(b.equalsIgnoreCase("ff"))
	{
		System.setProperty("webdriver.gecko.driver", "F:\\DD1\\Software\\JarsAndAPIs\\GeckoDriver\\geckodriver32b1.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}else {
		System.setProperty("webdriver.chrome.driver", "F:\\DD1\\Software\\JarsAndAPIs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	}

	@Test(dataProvider="getData")
	public void testLogin(String user, String pass)
	{
		System.out.println(user);
		System.out.println(pass);
	
	}	
	
	@DataProvider
	public Object getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "User1";
		data[0][1] = "Pass1";
		
		data[1][0] = "User2";
		data[1][1] = "Pass2";
		
		data[2][0] = "User3";
		data[2][1] = "Pass3";
				
		return data;
	}
	
}
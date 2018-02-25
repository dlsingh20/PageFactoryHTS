package Utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GMethods 
{
	public static WebDriver driver; 
	public static void urlOpen(String browser, String url) throws Exception
	{
		try {
			if(browser.equalsIgnoreCase("ff"))
			{
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(url);
				//Thread.sleep(1000);
			}else if(browser.equalsIgnoreCase("ch"))
			{
				System.setProperty("webdriver.chrome.driver", "F:\\DD1\\Software\\JarsAndAPIs\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get(url);
			}else {
				System.out.println("Wrong Browser Parameter");
			}	
		} catch (Exception e) {
			
			throw e;
		}
		
		
	}
	
	public static void takeScreenshot(String TestCaseName) throws Exception
	{
		try {
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\DD\\HTS\\NinethDecBatch\\iffcoTokio\\Screenshots\\"+TestCaseName+".jpeg"));
			
		} catch (Exception e) {
			throw e;		}
		
	}
	
	public static void writeInExcelFile()
	{
		//XSSFWorkbook wb = new XSSFWorkbook();
	}

}

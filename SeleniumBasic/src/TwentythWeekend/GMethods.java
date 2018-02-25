package TwentythWeekend;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GMethods 
{
	public static WebDriver driver;
	public static void launchURLAndBrowser(String url)
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.navigate().to("");
		
	}
	
	public static String readExcel(int row, int col) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\sony\\Desktop\\TestData.xlsx"));
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Data1");
		
		String str = sh.getRow(row).getCell(col).getStringCellValue();
		//System.out.println(str);
		return str;
	}
	
	public static void mouseOver(WebElement ele)
	{
		Actions act = new Actions(GMethods.driver);
		act.moveToElement(ele).perform();
	}

}

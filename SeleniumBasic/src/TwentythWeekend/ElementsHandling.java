package TwentythWeekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class ElementsHandling {

	public static void main(String[] args) throws InterruptedException {
		//googleLinks();
		//dropDown();
		//others();
		
		//dd();
		actionClass();
	}
	
	public static void actionClass() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.online.iffcotokio.co.in/itgiwebportal/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
				
		Actions act = new Actions(driver);
		
		WebElement login = driver.findElement(By.id("button"));
		//act.moveToElement(login).doubleClick().perform();;
		
		act.moveToElement(login).contextClick().build().perform();;
		
		/*
		WebElement healInsu = driver.findElement(By.xpath("//div[@class='navigation desktop']/ul/li[2]/a"));
		act.moveToElement(healInsu).perform();
		act.moveToElement(healInsu).doubleClick();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='navigation desktop']/ul/li[2]/div/ul/li[2]/a")).click();
		
		*/
		
	}
	
	public static void dd() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		
		WebElement mon = driver.findElement(By.xpath("//span[@id='BirthMonth']/div"));
		mon.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='June']")).click();
		
	}
	
	public static void others() throws InterruptedException
	{
		
		
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//span[@class='_5k_3']/span/input"));;
		f.click();
		Thread.sleep(3000);
		boolean sts =f.isSelected();
		System.out.println(sts);
		
		
		driver.findElement(By.xpath("//span[@class='_5k_3']/span[2]/input")).click();;;
		Thread.sleep(2000);
		boolean sts1 =f.isSelected();
		System.out.println(sts1);
		
	}
	
	public static void dropDown()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement date = driver.findElement(By.id("day"));
		
		if(date.isEnabled())
		{
			Select dat = new Select(date);
			dat.selectByIndex(5);
		}
		
		
		WebElement mon = driver.findElement(By.id("month"));
		Select mont = new Select(mon);
		mont.selectByValue("11");
		
		WebElement year = driver.findElement(By.id("year"));
		Select yr = new Select(year);
		yr.selectByVisibleText("1988");
		
		
		
		
		/*
		selectByIndex
		selectByValue
		selectByVisibleText
		*/
	}
	public static void googleLinks()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=fA9jWvCgH9KmX_23hIAH");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Download java");
		driver.findElement(By.name("btnK")).click();
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='rso']//div[@class='srg']//h3/a"));
		int size = ele.size();
		System.out.println(size);
		
		ele.get(3).click();;
		/*for(int i=0; i<size; i++)
		{
			String str = ele.get(i).getText();
			System.out.println(str);
		}
		*/
	}
	
	
	
	

}

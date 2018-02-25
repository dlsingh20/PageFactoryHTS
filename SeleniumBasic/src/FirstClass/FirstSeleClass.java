package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleClass {

	public static void main(String[] args) throws InterruptedException 
	{		 
		System.setProperty("", "");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		ele.clear();
		ele.sendKeys("");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='btnK']"));
		search.click();
		
		WebElement clickSelenium = driver.findElement(By.xpath("//div[@class='rc']/h3[@class='r']/a"));
		clickSelenium.click();
		
		Thread.sleep(5000);
		driver.close();
	}
	
	public void test()
	{
		
	}

}

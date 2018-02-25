package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//locators();

		ess();
	}	
	public static void locators()
	{
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		WebElement searchBox = driver.findElement(By.id("lst-ib"));
		searchBox.sendKeys("download java");
		
		WebElement gmail = driver.findElement(By.tagName("a"));
		System.out.println(gmail.getText());
		//gmail.click();
		
		
		WebElement btn_Search = driver.findElement(By.name("btnK"));
		btn_Search.click();
		
		
		//WebElement images = driver.findElement(By.linkText("Images"));
		//images.click();
		
		WebElement clickDoOracle = driver.findElement(By.partialLinkText("Downloads - Oracle"));
		String str = clickDoOracle.getText();
		System.out.println(str);
		clickDoOracle.click();
		
		
	}
	
	public static void ess() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.essexapartmenthomes.com/");
		
		Thread.sleep(5000);
		
		WebElement about = driver.findElement(By.xpath("//ul[@class='menu']/li[4]/a"));
		about.click();
	}

}

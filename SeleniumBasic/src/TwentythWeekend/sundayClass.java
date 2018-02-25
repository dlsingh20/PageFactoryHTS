package TwentythWeekend;

import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sundayClass {

	public static void main(String[] args) throws InterruptedException {
		jsTest();

	}
	
	public static void jsTest() throws InterruptedException
	{
		GMethods.launchURLAndBrowser("https://www.online.iffcotokio.co.in/itgiwebportal/");
		
		Thread.sleep(2500);
		GMethods.driver.navigate().refresh();
		
		GMethods.driver.findElement(By.id("button")).click();
		Thread.sleep(2500);
		
		
		Alert al = GMethods.driver.switchTo().alert();
		System.out.println(al.getText());
		//al.dismiss();
		//al.sendKeys("aaa");
		al.accept();
		
		GMethods.driver.switchTo().frame("aa");
		//WebElement ele=..........
		//ele.click();..........
		GMethods.driver.switchTo().defaultContent();
		//www.hotelogix.com
		
	}

}
